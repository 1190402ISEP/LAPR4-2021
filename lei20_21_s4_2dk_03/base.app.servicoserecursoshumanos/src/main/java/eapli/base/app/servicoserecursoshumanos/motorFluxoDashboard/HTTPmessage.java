package eapli.base.app.servicoserecursoshumanos.motorFluxoDashboard;

import java.io.*;


/**
 * The type Htt pmessage.
 *
 * @author ANDRE MOREIRA (asc@isep.ipp.pt)
 */
public class HTTPmessage {

    private static final int CR = 13;
    private static final int LF = 10;

    private static final String VERSION = "HTTP/1.1";

    private static final String CONTENT_TYPE = "Content-type:";
    private static final String CONTENT_LENGTH = "Content-length:";
    private static final String CONNECTION = "Connection:";

    private static final String[][] knownFileExt = {
            {".pdf", "application/pdf"},
            {".js", "application/javascript"},
            {".txt", "text/plain"},
            {".gif", "image/gif"},
            {".png", "image/png"}
    };

    static private String readHeaderLine(DataInputStream in) throws IOException {
        String ret = "";
        int val;
        do {
            val = in.read();
            if (val == -1) throw new IOException();
            if (val != CR) ret = ret + (char) val;
        }
        while (val != CR);
        val = in.read(); // read LF
        if (val == -1) throw new IOException();
        return ret;
    }

    static private void writeHeaderLine(DataOutputStream out, String line) throws IOException {
        out.write(line.getBytes(), 0, line.length());
        out.write(CR);
        out.write(LF);
    }

    //// NON-STATIC (INSTANCE) ELEMENTS

    private boolean isRequest;
    private String method;
    private String uri;
    private String status;

    private String contentType;
    private byte[] content;

    /**
     * Creates a new HTTPmessage by receiving it from an DataInputStream
     *
     * @param in the in
     * @throws IOException the io exception
     */
    public HTTPmessage(DataInputStream in) throws IOException {
        String firstLine = readHeaderLine(in);
        isRequest = !firstLine.startsWith("HTTP/");
        method = null;
        uri = null;
        content = null;
        status = null;
        contentType = null;

        String[] firstLineComp = firstLine.split(" ");
        if (isRequest) {
            method = firstLineComp[0];
            uri = firstLineComp[1];
        } else {  // response
            status = firstLineComp[1] + " " + firstLineComp[2];
        }

        String headerLine;

        do {
            headerLine = readHeaderLine(in);
            if (headerLine.toUpperCase().startsWith(CONTENT_TYPE.toUpperCase())) {
                contentType = headerLine.substring(CONTENT_TYPE.length()).trim();
            } else if (headerLine.toUpperCase().startsWith(CONTENT_LENGTH.toUpperCase())) {
                String cLen = headerLine.substring(CONTENT_LENGTH.length()).trim();
                int len;
                try {
                    len = Integer.parseInt(cLen);
                } catch (NumberFormatException ne) {
                    throw new IOException();
                }
                content = new byte[len];
            }
        }
        while (!headerLine.isEmpty());

        // READ CONTENT
        if (content != null) in.readFully(content, 0, content.length);
    }

    /**
     * Instantiates a new Htt pmessage.
     */
    public HTTPmessage() {
        isRequest = true;
        method = null;
        uri = null;
        content = null;
        status = null;
        contentType = null;
    }

    /**
     * Sets response status.
     *
     * @param sT the s t
     */
    public void setResponseStatus(String sT) {
        isRequest = false;
        status = sT;
    }

    /**
     * Sets content.
     *
     * @param cnt   the cnt
     * @param cType the c type
     */
    public void setContent(String cnt, String cType) {
        content = cnt.getBytes();
        contentType = cType;
    }

    /**
     * Sets request method.
     *
     * @param m the m
     */
    public void setRequestMethod(String m) {
        isRequest = true;
        method = m;
    }

    /**
     * Send boolean.
     *
     * @param out the out
     * @return the boolean
     * @throws IOException the io exception
     */
    public boolean send(DataOutputStream out) throws IOException {
        if (isRequest) {
            if (method == null || uri == null) return false;
            writeHeaderLine(out, method + " " + uri + " " + VERSION);
        } else {
            if (status == null) return false;
            writeHeaderLine(out, VERSION + " " + status);
        }

        if (content != null) {
            if (contentType != null) writeHeaderLine(out, CONTENT_TYPE + " " + contentType);
            writeHeaderLine(out, CONTENT_LENGTH + " " + content.length);
        }
        writeHeaderLine(out, CONNECTION + " close");
        writeHeaderLine(out, "");
        if (content != null) {
            out.write(content, 0, content.length);
        }
        return true;
    }

    /**
     * Gets method.
     *
     * @return the method
     */
    public String getMethod() {
        return method;
    }

    /**
     * Gets uri.
     *
     * @return the uri
     */
    public String getURI() {
        return uri;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets uri.
     *
     * @param u the u
     */
    public void setURI(String u) {
        uri = u;
    }

    /**
     * Has content boolean.
     *
     * @return the boolean
     */
    public boolean hasContent() {
        return (content != null);
    }

    /**
     * Gets content as string.
     *
     * @return the content as string
     */
    public String getContentAsString() {
        return (new String(content));
    }

    /**
     * Get content byte [ ].
     *
     * @return the byte [ ]
     */
    public byte[] getContent() {
        return (content);
    }

    /**
     * Sets content from string.
     *
     * @param c  the c
     * @param ct the ct
     */
    public void setContentFromString(String c, String ct) {
        content = c.getBytes();
        contentType = ct;
    }

    /**
     * Sets content from file.
     *
     * @param fname the fname
     * @return the content from file
     */
    public boolean setContentFromFile(String fname) {
        File f = new File(fname);
        contentType = null;
        if (!f.exists()) {
            content = null;
            return false;
        }
        for (String[] k : knownFileExt) {
            if (fname.endsWith(k[0]))
                contentType = k[1];
        }
        if (contentType == null) contentType = "text/html";

        int cLen = (int) f.length();
        if (cLen == 0) {
            content = null;
            contentType = null;
            return false;
        }

        content = new byte[cLen];

        DataInputStream fr;
        try {
            fr = new DataInputStream(new FileInputStream(f));
            try {
                fr.readFully(content, 0, cLen);
                fr.close();
            } catch (IOException ex) {
                System.out.println("Error reading file");
                content = null;
                contentType = null;
                return false;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
            content = null;
            contentType = null;
            return false;
        }
        return true;
    }

} // CLASS END
