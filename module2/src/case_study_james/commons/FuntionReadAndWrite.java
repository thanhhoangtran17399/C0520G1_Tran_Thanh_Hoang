package case_study_james.commons;

import case_study_james.models.Dictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FuntionReadAndWrite {
    public static final String PATH = "src/case_study_james/data/Dictionary.csv";
    public static final String COMA = ",";
    public static final String NEW_LINE = "\n";

    public static Map<String, Dictionary> readDictionary() {
        BufferedReader br = null;
        Map<String, Dictionary> dictionaryMap = new HashMap<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(PATH));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                Dictionary dictionary = new Dictionary();
                dictionary.setNameOfWord(splitData[0]);
                dictionary.setPronounce(splitData[1]);
                dictionary.setTypeOfWord(splitData[2]);
                dictionary.setSimilarWord(splitData[3]);
                dictionaryMap.put(dictionary.getNameOfWord(), dictionary);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return dictionaryMap;
    }

    public static void writeDictionary(LinkedList<Dictionary> listWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH, true);
            for (Dictionary dictionary : listWord) {
                writer.append(dictionary.getNameOfWord());
                writer.append(COMA);
                writer.append(dictionary.getPronounce());
                writer.append(COMA);
                writer.append(dictionary.getTypeOfWord());
                writer.append(COMA);
                writer.append(dictionary.getSimilarWord());
                writer.append(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println("Error in  writeDirectory");
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void writeNewDictionary(LinkedList<Dictionary> listWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH, false);
            for (Dictionary dictionary : listWord) {
                writer.append(dictionary.getNameOfWord());
                writer.append(COMA);
                writer.append(dictionary.getPronounce());
                writer.append(COMA);
                writer.append(dictionary.getTypeOfWord());
                writer.append(COMA);
                writer.append(dictionary.getSimilarWord());
                writer.append(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println("Error in  writeDirectory");
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }
}
