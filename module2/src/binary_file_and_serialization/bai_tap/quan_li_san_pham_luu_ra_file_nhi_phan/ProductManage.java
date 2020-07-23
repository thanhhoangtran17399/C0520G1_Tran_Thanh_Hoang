package binary_file_and_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManage {

    public static final String FILE_PATH = "D:\\C0520G1_Tran_Thanh_Hoang\\module2\\src\\binary_file_and_serialization\\bai_tap\\quan_li_san_pham_luu_ra_file_nhi_phan\\productManage";
    static List<Product> productList = new ArrayList<>();

    public static void writeFile(String filePath){
        FileOutputStream fos = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fos = new FileOutputStream(filePath);
            objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(productList);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filePath) {
        FileInputStream fis = null;
        ObjectInputStream objectInputStream = null;
        try {
            fis = new FileInputStream(filePath);
            objectInputStream = new ObjectInputStream(fis);

            List<Product> productList = (List<Product>) objectInputStream.readObject();
            for (Product product : productList) {
                System.out.println(product.toString());
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        do {
            System.out.println("Nhập vào lựa chọn: \n"
                    + "1.Thêm sản phẩm\n"
                    + "2.Sửa thông tin sản phẩm theo id\n"
                    + "3.Xoá sản phẩm theo id\n"
                    + "4.Hiển thị danh sách sản phẩm\n"
                    + "5.Thoát ");
            System.out.println("nhap lua chon: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1: {

                    System.out.println("Nhập mã sản phẩm: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập hãng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    int price = scanner.nextInt();
                    productList.add(new Product(id, name, manufacturer, price));
                }
                break;
                case 2:
                    System.out.println("Nhập mã sản phẩm cần sửa");
                    int inputId = scanner.nextInt();
                    boolean check1 = false;
                    int index = 0;
                    for (int i = 0; i < productList.size(); i++) {
                        if (inputId == productList.get(i).getProductID()) {
                            check1 = true;
                            index = i;
                        }
                    }
                    if (check1) {
                        System.out.print("Nhập mã sản phẩm mới: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nhập tên sản phẩm mới: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập hãng sản xuất mới: ");
                        String manufacturer = scanner.nextLine();
                        System.out.print("Nhập giá sản phẩm mới: ");
                        int price = scanner.nextInt();
                        productList.set(index, new Product(id, name, manufacturer, price));
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    int id = scanner.nextInt();
                    for (int i = 0; i < productList.size(); i++) {
                        if (id == productList.get(i).getProductID()) {
                            productList.remove(i);
                            break;
                        }
                    }
                case 4:
                    readFile(FILE_PATH);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập sai");
            }
                writeFile(FILE_PATH);
        } while (check);
    }
}

