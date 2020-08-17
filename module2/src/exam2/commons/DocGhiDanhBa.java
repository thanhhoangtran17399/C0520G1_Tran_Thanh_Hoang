package exam2.commons;

import exam2.models.DanhBa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DocGhiDanhBa {
    public static final String PATH = "src/exam2/data/danhBa.csv";
    public static final String COMA = ",";
    public static final String NEW_LINE = "\n";

    public static void ghiDanhBa(ArrayList<DanhBa> danhSachDanhBa) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH, true);
            for (DanhBa danhBa : danhSachDanhBa) {
                writer.append(danhBa.getSoDienThoai());
                writer.append(COMA);
                writer.append(danhBa.getNhom());
                writer.append(COMA);
                writer.append(danhBa.getHoTen());
                writer.append(COMA);
                writer.append(danhBa.getGioiTinh());
                writer.append(COMA);
                writer.append(danhBa.getDiaChi());
                writer.append(COMA);
                writer.append(danhBa.getNgaySinh());
                writer.append(COMA);
                writer.append(danhBa.getEmail());
                writer.append(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println("Error in  ExportProduct");
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static Map<String, DanhBa> docDanhBa() {
        BufferedReader br = null;
        Map<String, DanhBa> danhBaHashMap = new HashMap<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(PATH));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                DanhBa danhBa = new DanhBa();
                danhBa.setSoDienThoai(splitData[0]);
                danhBa.setNhom(splitData[1]);
                danhBa.setHoTen(splitData[2]);
                danhBa.setGioiTinh(splitData[3]);
                danhBa.setDiaChi(splitData[4]);
                danhBa.setNgaySinh(splitData[5]);
                danhBa.setEmail(splitData[6]);
               danhBaHashMap.put(danhBa.getSoDienThoai(), danhBa);
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
        return danhBaHashMap;
    }

    public static void ghiDanhBaMoi(ArrayList<DanhBa> danhSachDanhBa) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH, false);
            for (DanhBa danhBa : danhSachDanhBa) {
                writer.append(danhBa.getSoDienThoai());
                writer.append(COMA);
                writer.append(danhBa.getNhom());
                writer.append(COMA);
                writer.append(danhBa.getHoTen());
                writer.append(COMA);
                writer.append(danhBa.getGioiTinh());
                writer.append(COMA);
                writer.append(danhBa.getDiaChi());
                writer.append(COMA);
                writer.append(danhBa.getNgaySinh());
                writer.append(COMA);
                writer.append(danhBa.getEmail());
                writer.append(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println("Error in  ExportProduct");
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
