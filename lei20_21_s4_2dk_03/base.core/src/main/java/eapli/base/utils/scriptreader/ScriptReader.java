package eapli.base.utils.scriptreader;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * The interface Script reader.
 */
public interface ScriptReader {
    /**
     * Read file list.
     *
     * @param fileName the file name
     * @return the list
     * @throws FileNotFoundException the file not found exception
     */
    List<String> readFile(String fileName) throws FileNotFoundException;
}
