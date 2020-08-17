package exam2.controllers;

import case_study.commons.Validate;
import exam2.commons.DocGhiDanhBa;
import exam2.models.DanhBa;

import java.util.*;

public class QuanLiDanhBa {
    public static void displayMainMenu() {
        System.out.println("---Chuong trinh quan li danh ba---");
        System.out.println("1.Xem danh sach: " + "\n"
                + "2.Them moi: " + "\n"
                + "3.Cap nhat: " + "\n"
                + "4.Xoa: " + "\n"
                + "5.Tim kiem" + "\n"
                + "6.Doc tu file" + "\n"
                + "7.Ghi vao file" + "\n"
                + "8.Thoat");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon chuc nang: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                xemDanhSach();
                break;
            case 2:
                themMoi();
                break;
            case 3:
                capNhat();
                break;
            case 4:
                xoa();
                break;
            case 5:
                timKiem();
                break;
            case 6:
                DocGhiDanhBa.docDanhBa();
                break;
           /* case 7:
                DocGhiDanhBa.ghiDanhBa();
                break;*/
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Nhap loi, vui long nhan Enter de nhap lai: ");
                scanner.nextLine();
                displayMainMenu();
        }
    }

    private static void xemDanhSach() {
        Scanner scanner = new Scanner(System.in);
        Map<String, DanhBa> danhSachDanhBa = DocGhiDanhBa.docDanhBa();

        for (Map.Entry<String, DanhBa> entry : danhSachDanhBa.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }
        System.out.println("Xem danh sach thanh cong, nhan enter de tiep tuc !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void themMoi() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DanhBa> danhSachDanhBa = new ArrayList<>();

            System.out.print("Nhap so dien thoai: ");
        String soDienThoai = scanner.nextLine();
        System.out.print("Nhap nhom: ");
        String nhom = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Nhap email: ");
        String email = scanner.nextLine();
        danhSachDanhBa.add(new DanhBa(soDienThoai, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email));
        DocGhiDanhBa.ghiDanhBa(danhSachDanhBa);
        System.out.print("Them moi thanh cong, nhan enter de tiep tuc !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void capNhat() {
        Map<String, DanhBa> danhBaMap = DocGhiDanhBa.docDanhBa();
        ArrayList<DanhBa> danhSachDanhBa = new ArrayList<>();
        for (Map.Entry<String, DanhBa> entry : danhBaMap.entrySet()) {
            System.out.println(entry.getValue().toString());
            danhSachDanhBa.add(entry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dien thoai cua danh ba ma ban muon xoa: ");
        String choose = scanner.nextLine();
        for (int i = 0; i < danhSachDanhBa.size(); i++) {
            if (choose.equals(danhSachDanhBa.get(i).getSoDienThoai())) {

                    System.out.print("Nhap so dien thoai: ");
                String  soDienThoai = scanner.nextLine();
                System.out.print("Nhap nhom: ");
                String nhom = scanner.nextLine();
                System.out.print("Nhap ho ten: ");
                String hoTen = scanner.nextLine();
                System.out.print("Nhap gioi tinh: ");
                String gioiTinh = scanner.nextLine();
                System.out.print("Nhap dia chi: ");
                String diaChi = scanner.nextLine();
                System.out.print("Nhap ngay sinh: ");
                String ngaySinh = scanner.nextLine();
                System.out.print("Nhap email: ");
                String email = scanner.nextLine();
                danhSachDanhBa.set(i, new DanhBa(soDienThoai, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email));
                break;
            }
        }
        System.out.println(danhSachDanhBa.toString());
        DocGhiDanhBa.ghiDanhBaMoi(danhSachDanhBa);
        System.out.print("Them moi thanh cong, nhan Enter de tiep tuc !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void xoa() {
        Map<String, DanhBa> danhBaMap = DocGhiDanhBa.docDanhBa();
        ArrayList<DanhBa> danhSachDanhBa = new ArrayList<>();
        for (Map.Entry<String, DanhBa> entry : danhBaMap.entrySet()) {
            System.out.println(entry.getValue().toString());
            danhSachDanhBa.add(entry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dien thoai cua danh ba ma ban muon xoa: ");
        String choose = scanner.nextLine();
        for (int i = 0; i < danhSachDanhBa.size(); i++) {
            if (choose.equals(danhSachDanhBa.get(i).getSoDienThoai())) {
                danhSachDanhBa.remove(i);
                break;
            }
        }
        System.out.println(danhSachDanhBa.toString());
        DocGhiDanhBa.ghiDanhBaMoi(danhSachDanhBa);
        System.out.print("Xoa thanh cong, nhan Enter de tiep tuc !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void timKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dien thoai cua danh ba ma ban can tim kiem: ");
        String soDienThoai = scanner.nextLine();
        Map<String, DanhBa> danhBaMap = DocGhiDanhBa.docDanhBa();
        for (Map.Entry<String, DanhBa> entry : danhBaMap.entrySet()) {
            if (soDienThoai.equals(entry.getKey())) {
                System.out.println(entry.getKey() + "" + entry.getValue());

            }
        }
        System.out.println("Tim kiem thanh cong, nhan Enter de tiep tuc !!!");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
