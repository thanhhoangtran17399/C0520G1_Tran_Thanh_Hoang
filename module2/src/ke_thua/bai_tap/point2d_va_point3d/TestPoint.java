package ke_thua.bai_tap.point2d_va_point3d;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        double x = scanner.nextDouble();
        System.out.println("Nhap y: ");
        double y = scanner.nextDouble();
        System.out.println("Nhap z: ");
        double z = scanner.nextDouble();
        Point3D testPoint = new Point3D(x, y, z);
        System.out.println(testPoint);
    }
}
