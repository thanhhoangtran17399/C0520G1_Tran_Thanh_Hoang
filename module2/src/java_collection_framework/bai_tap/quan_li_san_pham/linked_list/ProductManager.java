package java_collection_framework.bai_tap.quan_li_san_pham.linked_list;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        LinkedList<Product> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Nhập vào lựa chọn: \n"
                    + "1.Thêm sản phẩm\n"
                    + "2.Sửa thông tin sản phẩm theo id\n"
                    + "3.Xoá sản phẩm theo id\n"
                    + "4.Hiển thị danh sách sản phẩm\n"
                    + "5.Tìm kiếm sản phẩm theo tên\n"
                    + "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n"
                    + "7.Thoát ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewProduct(linkedList, scanner);
                    break;
                case 2:
                    editProductInformation(linkedList, scanner);
                    break;
                case 3:
                    deleteProduct(linkedList, scanner);
                case 4:
                    for (Product p : linkedList) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    findProductByName(linkedList, scanner);
                case 6:
                    sortProduct(linkedList, scanner);
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập sai");
            }

        } while (check);
    }

    public static void addNewProduct(LinkedList<Product> linkedList, Scanner scanner) {

        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        int price = scanner.nextInt();
        linkedList.add(new Product(id, name, price));
    }

    public static void editProductInformation(LinkedList<Product> linkedList, Scanner scanner) {
        System.out.println("Nhập mã sản phẩm cần sửa");
        int inputId = scanner.nextInt();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (inputId == linkedList.get(i).getId()) {
                check = true;
                index = i;
            }
        }
        if (check) {
            scanner.nextLine();
            System.out.println("Nhập tên sản phẩm mới: ");
            String name = scanner.nextLine();
            System.out.println("Nhập mã sản phẩm mới");
            int id = scanner.nextInt();
            System.out.println("Nhập giá sản phẩm mới");
            double price = scanner.nextDouble();
            linkedList.set(index, new Product(id, name, (int) price));
        }
    }

    public static void deleteProduct(LinkedList<Product> linkedList, Scanner scanner) {
        System.out.println("Nhập mã sản phẩm cần xóa");
        int inputId = scanner.nextInt();
        for (int i = 0; i < linkedList.size(); i++) {
            if (inputId == linkedList.get(i).getId()) {
                linkedList.remove(i);
            }
        }
    }

    public static void findProductByName(LinkedList<Product> linkedList, Scanner scanner) {

        System.out.print("Nhập tên sản phẩm cần tìm: ");
        scanner.nextLine();
        String inputName = scanner.nextLine();
        Product product = null;
        for (Product p : linkedList) {
            if (inputName.equals(p.getName())) {
                product = p;
                break;
            }
        }

        if (product == null) {
            System.out.println("Product " + inputName + " not found!");
        } else {
            System.out.println("Result: " + product);
        }

    }

    private static void sortProduct(LinkedList<Product> linkedList, Scanner scanner) {
        int chosse;
        System.out.println("1: Sắp xếp tăng dần" + "\n" + "2: Sắp xếp giảm dần" + "\nNhập: ");
        chosse = scanner.nextInt();
        if (chosse == 1) {
            Collections.sort(linkedList, new SortAscendingt());
            for (Product arr : linkedList) {
                System.out.println(arr);
            }
        } else {
            Collections.sort(linkedList, new SortDescending());
            for (Product p : linkedList) {
                System.out.println(p);
            }
        }
    }
}
