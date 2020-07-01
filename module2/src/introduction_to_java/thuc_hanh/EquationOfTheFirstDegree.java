package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class EquationOfTheFirstDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.print("The solution is: " + solution +"\n");
            if (a != 0) {
                double answer = (c - b) / a;
                System.out.print("Equation pass with x = " + answer);
            } else {
                if (b == 0) {
                    System.out.print("The solution is all x");
                } else {
                    System.out.print("No solution");
                }
            }
        }
    }
}
