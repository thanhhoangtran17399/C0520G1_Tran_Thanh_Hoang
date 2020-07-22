package io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CharacterFile {
    static String str = "";

    public static void readFile() {
        File file = new File("D:\\C0520G1_Tran_Thanh_Hoang\\module2\\src\\io_text_file\\bai_tap\\copy_file_text\\test_reader");
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
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        File file2 = new File("D:\\C0520G1_Tran_Thanh_Hoang\\module2\\src\\io_text_file\\bai_tap\\copy_file_text\\test2");
        try {
            FileWriter fileWriter = new FileWriter(file2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);

            bufferedWriter.close();
            fileWriter.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile();
        writeFile();
    }
}

