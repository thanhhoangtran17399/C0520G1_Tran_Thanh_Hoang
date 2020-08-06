package case_study.models;

import case_study.commons.FuntionReadAndWriteCSV;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    private static Stack<Employee> employeeStack = new Stack<>();

    public static void pushEmployeeToCabinets() {
        Map<String, Employee> employeeMap = FuntionReadAndWriteCSV.readEmployee();
        for (Map.Entry<String, Employee> employeeEntry : employeeMap.entrySet()) {
            employeeStack.push(employeeEntry.getValue());
        }
    }

    public static void searchEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input id employee: ");
        String id = scanner.nextLine();
        while (!employeeStack.isEmpty()) {
            if (id.equals(employeeStack.peek().getId())) {
                System.out.println(employeeStack.peek());
                break;
            } else {
                employeeStack.pop();
            }
        }
    }
}
