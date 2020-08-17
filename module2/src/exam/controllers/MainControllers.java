package exam.controllers;

import exam.commons.ReadAndWrite;
import exam.models.ExportProduct;
import exam.models.ImportProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class MainControllers {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----MENU-----");
        System.out.println("1. Add new product: " + "\n"
                + "2. Delete: " + "\n"
                + "3. Show list product: " + "\n"
                + "4. Search product: " + "\n"
                + "5.Exit");
        System.out.println("Enter your choose: ");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                addNewProduct();
                break;
            case "2":
                delete();
                break;
            case "3":
                showListProduct();
                break;
            case "4":
                searchProduct();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail ! Please choose again, enter to continue !");
                scanner.nextLine();
                displayMainMenu();
        }
    }

    private static void searchProduct() {

    }

    private static void showListProduct() {

    }

    private static void delete() {
        Scanner scanner = new Scanner(System.in);
        String choose;
        System.out.println("1. Delete importProduct: " + "\n" +
                "2. Delete export product: ");
        System.out.println("Enter your choose: ");
        choose = scanner.nextLine();
        switch (choose) {
            case "1":
                deleteImportProduct();
                break;
            case "2":
                deleteExportProduct();
                break;
        }
    }

    private static void deleteExportProduct() {

    }

    private static void deleteImportProduct() {

    }

    private static void addNewProduct() {
        Scanner scanner = new Scanner(System.in);
        String choose;
        System.out.println("1. Add new importProduct: " + "\n" +
                "2. Add new export product: ");
        System.out.println("Enter your choose: ");
        choose = scanner.nextLine();
        switch (choose) {
            case "1":
                addNewImportProduct();
                break;
            case "2":
                addNewExportProduct();
                break;
        }

    }

    private static void addNewExportProduct() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ExportProduct> exportProductArrayList = new ArrayList<>();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product code: ");
        String productCode = scanner.nextLine();
        System.out.println("Enter name product: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter cost: ");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter producer: ");
        String producer = scanner.nextLine();
        System.out.println("Enter exportCost: ");
        double exportCost = Double.parseDouble(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter countryImport: ");
        String countryImport = scanner.nextLine();
        exportProductArrayList.add(new ExportProduct(id, productCode, nameProduct, cost, amount, producer, exportCost, countryImport));
        ReadAndWrite.writeExportProduct(exportProductArrayList);
        System.out.print("Add new ExportProduct complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewImportProduct() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ImportProduct> importProductArrayList = new ArrayList<>();
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter product code: ");
        String productCode = scanner.nextLine();
        System.out.println("Enter name product: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter cost: ");
        double cost = scanner.nextDouble();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter producer: ");
        String producer = scanner.nextLine();
        System.out.println("Enter import cost: ");
        double importCost = scanner.nextDouble();
        System.out.println("Enter provinceImport: ");
        String provinceImport = scanner.nextLine();
        System.out.println("Enter taxImport: ");
        double taxImport = scanner.nextDouble();
        importProductArrayList.add(new ImportProduct(id, productCode, nameProduct, cost, amount, producer, importCost, provinceImport, taxImport));
        ReadAndWrite.writeImportProduct(importProductArrayList);
        System.out.print("Add new ExportProduct complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
