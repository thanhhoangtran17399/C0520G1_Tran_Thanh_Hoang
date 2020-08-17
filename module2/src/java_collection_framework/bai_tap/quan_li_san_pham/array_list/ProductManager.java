package java_collection_framework.bai_tap.quan_li_san_pham.array_list;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void main(String[] args) {
        ArrayList<Product> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        Product product = new Product(1, "a", 12);
        Product product1 = new Product(2, "b", 13);
        Product product2 = new Product(3, "c", 11);
        Product product3 = new Product(4, "d", 20);

        arrayList.add(product);
        arrayList.add(product1);
        arrayList.add(product2);
        arrayList.add(product3);
        do {
            System.out.println("Nhập vào lựa chọn: \n"
                    + "1.Thêm sản phẩm\n"
                    + "2.Sửa thông tin sản phẩm theo id\n"
                    + "3.Xoá sản phẩm theo id\n"
                    + "4.Hiển thị danh sách sản phẩm\n"
                    + "5.Tìm kiếm sản phẩm theo tên\n"
                    + "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n"
                    + "7.Thoát ");
            System.out.println("nhap de ban oi: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:

                    addNewProduct(arrayList, scanner);
                    break;
                case 2:
                    editProductInformation(arrayList, scanner);
                    break;
                case 3:
                    deleteProduct(arrayList, scanner);
                case 4:
                    for (Product p : arrayList) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    findProductByName(arrayList, scanner);
                    break;
                case 6:
                    sortProduct(arrayList, scanner);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập sai");
            }

        } while (check);
    }

    public static void addNewProduct(ArrayList<Product> arrayList, Scanner scanner) {

        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        int price = scanner.nextInt();
        arrayList.add(new Product(id, name, price));
    }

    public static void editProductInformation(ArrayList<Product> arrayList, Scanner scanner) {
        System.out.println("Nhập mã sản phẩm cần sửa");
        int inputId = scanner.nextInt();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (inputId == arrayList.get(i).getId()) {
                check = true;
                index = i;
            }
        }
        if (check) {
            scanner.nextLine();
            System.out.print("Nhập tên sản phẩm mới: ");
            String name = scanner.nextLine();
            System.out.print("Nhập mã sản phẩm mới: ");
            int id = scanner.nextInt();
            System.out.print("Nhập giá sản phẩm mới: ");
            int price = scanner.nextInt();
            arrayList.set(index, new Product(id, name, price));
        }
    }

    public static void deleteProduct(ArrayList<Product> arrayList, Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        int inputId = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (inputId == arrayList.get(i).getId()) {
                arrayList.remove(i);
                break;
            }
        }
    }

    public static void findProductByName(ArrayList<Product> arrayList, Scanner scanner) {

        System.out.print("Nhập tên sản phẩm cần tìm: ");
        scanner.nextLine();
        String inputName = scanner.nextLine();
//        Product product = null;
//        for (Product p : arrayList) {
//            if (inputName.equals(p.getName())) {
//                product = p;
//                break;
//            }
//        }
//
//        if (product == null) {
//            System.out.println("Không tìm thấy sản phẩm " + inputName);
//        } else {
//            System.out.println("Kết quả tìm kiếm: " + product);
//        }
        boolean check = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (inputName.equals(arrayList.get(i).getName())) {
                System.out.println(arrayList.get(i).toString());
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (check == false) {
            System.out.println("Không tìm thấy sản phẩm " + inputName);
        }
    }

    private static void sortProduct(ArrayList<Product> arrayList, Scanner scanner) {
        int chosse;
        System.out.println("1: Sắp xếp tăng dần" + "\n" + "2: Sắp xếp giảm dần" + "\nNhập: ");
        chosse = scanner.nextInt();
        if (chosse == 1) {
            Collections.sort(arrayList, new SortAscendingt());
            for (Product p : arrayList) {
                System.out.println(p);
            }
        } else {
            Collections.sort(arrayList, new SortDescending());
            for (Product p : arrayList) {
                System.out.println(p);
                break;
            }
        }
    }
}
