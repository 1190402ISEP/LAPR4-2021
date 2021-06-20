package eapli.base.utils.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * The type Csv importer.
 */
public class CsvImporterImpl implements FileImporterInterface {


    @Override
    public List<List<String>> readFile(String fileName) throws FileNotFoundException {

        List<List<String>> importing = new ArrayList<>();

        List<String> temp = new ArrayList<>();

        Scanner input = new Scanner(new File(fileName));

        input.nextLine();//Ignorar cabecalho que deve conter instrucoes de construcao dos ficheiros

        while (input.hasNextLine()) {
            String line = input.nextLine();
            temp = Arrays.asList(line.split(";"));
            importing.add(temp);
            temp = new ArrayList<>();
        }

        input.close();

        return importing;
    }
}
