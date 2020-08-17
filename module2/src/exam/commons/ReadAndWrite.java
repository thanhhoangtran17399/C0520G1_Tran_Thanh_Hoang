package exam.commons;

import case_study_james.models.Dictionary;
import exam.models.ExportProduct;
import exam.models.ImportProduct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReadAndWrite {
    public static final String PATH1 = "src/exam/data/importProducts.csv";
    public static final String PATH2 = "src/exam/data/exportProducts.csv";
    public static final String COMA = ",";
    public static final String NEW_LINE = "\n";

    public static void writeExportProduct(ArrayList<ExportProduct> exportProductArrayList) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH1, true);
            for (ExportProduct exportProduct : exportProductArrayList) {
                writer.append(String.valueOf(exportProduct.getId()));
                writer.append(COMA);
                writer.append(exportProduct.getProductCode());
                writer.append(COMA);
                writer.append(exportProduct.getNameProduct());
                writer.append(COMA);
                writer.append(String.valueOf(exportProduct.getCost()));
                writer.append(COMA);
                writer.append(String.valueOf(exportProduct.getAmount()));
                writer.append(COMA);
                writer.append(exportProduct.getProducer());
                writer.append(COMA);
                writer.append(String.valueOf(exportProduct.getExportCost()));
                writer.append(COMA);
                writer.append(exportProduct.getCountryImport());
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

    public static void writeImportProduct(ArrayList<ImportProduct> importProductArrayList) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH2, true);
            for (ImportProduct importProduct : importProductArrayList) {
                writer.append(String.valueOf(importProduct.getId()));
                writer.append(COMA);
                writer.append(importProduct.getProductCode());
                writer.append(COMA);
                writer.append(importProduct.getNameProduct());
                writer.append(COMA);
                writer.append(String.valueOf(importProduct.getCost()));
                writer.append(COMA);
                writer.append(String.valueOf(importProduct.getAmount()));
                writer.append(COMA);
                writer.append(importProduct.getProducer());
                writer.append(COMA);
                writer.append(String.valueOf(importProduct.getImportCost()));
                writer.append(COMA);
                writer.append(importProduct.getProvinceImport());
                writer.append(COMA);
                writer.append(String.valueOf(importProduct.getTaxImport()));
                writer.append(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println("Error in writeImportProduct");
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static Map<String, ExportProduct> readExportProduct() {
        BufferedReader br = null;
        Map<String, ExportProduct> exportProductMap = new HashMap<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(PATH1));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
               ExportProduct exportProduct = new ExportProduct();
                exportProduct.setId(Integer.parseInt(splitData[0]));
                exportProduct.setProductCode(splitData[1]);
                exportProduct.setNameProduct(splitData[2]);
                exportProduct.setAmount(Double.parseDouble(splitData[3]));
                exportProduct.setProducer(splitData[4]);
                exportProduct.setExportCost(Double.parseDouble(splitData[5]));
                exportProduct.setCountryImport(splitData[6]);
                exportProductMap.put(String.valueOf(exportProduct.getId()), exportProduct);
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
        return exportProductMap;
    }

    public static Map<String, ImportProduct> readImportProduct() {
        BufferedReader br = null;
        Map<String, ImportProduct> importProductMap = new HashMap<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(PATH1));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                ImportProduct importProduct = new ImportProduct();
                importProduct.setId(Integer.parseInt(splitData[0]));
                importProduct.setProductCode(splitData[1]);
                importProduct.setNameProduct(splitData[2]);
                importProduct.setAmount(Double.parseDouble(splitData[3]));
                importProduct.setProducer(splitData[4]);
                importProduct.setImportCost(Double.parseDouble(splitData[5]));
                importProduct.setProvinceImport(splitData[6]);
                importProduct.setTaxImport(Double.parseDouble(splitData[7]));
               importProductMap.put(String.valueOf(importProduct.getId()), importProduct);
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
        return importProductMap;
    }
}
