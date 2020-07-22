package io_text_file.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCsv {
    public static void main(String[] args) {
        String csvFile = "D:\\C0520G1_Tran_Thanh_Hoang\\module2\\src\\io_text_file\\bai_tap\\doc_file_csv\\test.csv";
        String line;
        String cvsSplitBy = ",";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
            while ((line = bufferedReader.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* static String str = "";
    public static void readFile() {
        File file = new File("D:\\C0520G1_Tran_Thanh_Hoang\\module2\\src\\io_text_file\\bai_tap\\doc_file_csv\\test.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                str += line;
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readFile();
    }*/