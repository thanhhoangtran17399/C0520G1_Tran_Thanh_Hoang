package ke_thua.bai_tap.circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HinhTru hinhTru = new HinhTru();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh day:");
        float r = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Nhap mau sac:");
        String mauSac = scanner.nextLine();
        System.out.println("Nhap chieu cao:");
        float h = scanner.nextFloat();
        hinhTru = new HinhTru(r, mauSac, h);
        System.out.println(hinhTru);
    }
}
