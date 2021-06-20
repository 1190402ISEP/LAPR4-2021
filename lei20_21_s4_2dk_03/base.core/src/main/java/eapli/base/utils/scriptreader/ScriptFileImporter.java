package eapli.base.utils.scriptreader;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The type Script file importer.
 */
public class ScriptFileImporter implements ScriptReader {
    @Override
    public List<String> readFile(String fileName) throws FileNotFoundException {

        List<String> file = new ArrayList<>();

        Scanner input = new Scanner(new File(fileName));

        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (!line.trim().isEmpty()) {
                file.add(line);
            }
        }
        input.close();

        return file;

    }
}
