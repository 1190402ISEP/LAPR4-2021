package eapli.base.utils.file;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * The interface File importer interface.
 */
public interface FileImporterInterface {

    /**
     * Read file list.
     *
     * @param fileName the file name
     * @return the information that was read
     * @throws FileNotFoundException the file not found exception
     */
    List<List<String>> readFile(String fileName) throws FileNotFoundException;

}
