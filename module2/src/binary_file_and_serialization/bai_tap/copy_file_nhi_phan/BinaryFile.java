package binary_file_and_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;


public class BinaryFile {
    public static void main(String[] args) {
        String sourceFile = "D:\\C0520G1_Tran_Thanh_Hoang\\module2\\src\\binary_file_and_serialization\\bai_tap\\copy_file_nhi_phan\\sourceFile";
        String destFile = "D:\\C0520G1_Tran_Thanh_Hoang\\module2\\src\\binary_file_and_serialization\\bai_tap\\copy_file_nhi_phan\\destFile";
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024];
            int noOfBytes ;

            System.out.println("Copying file using streams");


            while ((noOfBytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, noOfBytes);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while copying file " + ioe);
        }
        finally {

            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }
}
