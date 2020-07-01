package introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bạn cần đọc: ");
        int number = scanner.nextInt();
        String nameNumber = "";
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    nameNumber += "zero";
                    break;
                case 1:
                    nameNumber += "one";
                    break;
                case 2:
                    nameNumber += "two";
                    break;
                case 3:
                    nameNumber += "three";
                    break;
                case 4:
                    nameNumber += "four";
                    break;
                case 5:
                    nameNumber += "five";
                    break;
                case 6:
                    nameNumber += "six";
                    break;
                case 7:
                    nameNumber += "seven";
                    break;
                case 8:
                    nameNumber += "eight";
                    break;
                case 9:
                    nameNumber += "nine";
                    break;
            }
        } else if (number >= 10 && number < 20) {
            switch (number % 10) {
                case 0:
                    nameNumber += "ten";
                    break;
                case 1:
                    nameNumber += "eleven";
                    break;
                case 2:
                    nameNumber += "twelve";
                    break;
                case 3:
                    nameNumber += "thirteen";
                    break;
                case 4:
                    nameNumber += "fourteen";
                    break;
                case 5:
                    nameNumber += "fifteen";
                    break;
                case 6:
                    nameNumber += "sixteen";
                    break;
                case 7:
                    nameNumber += "seventeen";
                    break;
                case 8:
                    nameNumber += "eighteen";
                    break;
                case 9:
                    nameNumber += "nineteen";
                    break;
            }
        } else if (number >=20 && number < 100) {
            switch (number / 10) {
                case 2:
                    nameNumber += " twenty";
                    break;
                case 3:
                    nameNumber += " thirty";
                    break;
                case 4:
                    nameNumber += " forty";
                    break;
                case 5:
                    nameNumber += " fifty";
                    break;
                case 6:
                    nameNumber += " sixty";
                    break;
                case 7:
                    nameNumber += " seventy";
                    break;
                case 8:
                    nameNumber += " eighty";
                    break;
                case 9:
                    nameNumber += " ninety";
                    break;
            }
            switch (number % 10) {
                case 1:
                    nameNumber += " one";
                    break;
                case 2:
                    nameNumber += " two";
                    break;
                case 3:
                    nameNumber += " three";
                    break;
                case 4:
                    nameNumber += " four";
                    break;
                case 5:
                    nameNumber += " five";
                    break;
                case 6:
                    nameNumber += " six";
                    break;
                case 7:
                    nameNumber += " seven";
                    break;
                case 8:
                    nameNumber += " eight";
                    break;
                case 9:
                    nameNumber += " nine";
                    break;
            }
        } else if (number>= 100 && number < 1000) {
            switch (number / 100) {
                case 1:
                    nameNumber += " one hundred";
                    break;
                case 2:
                    nameNumber += " two hundred";
                    break;
                case 3:
                    nameNumber += " three hundred";
                    break;
                case 4:
                    nameNumber += " four hundred";
                    break;
                case 5:
                    nameNumber += " five hundred";
                    break;
                case 6:
                    nameNumber += " six hundred";
                    break;
                case 7:
                    nameNumber += " seven hundred";
                    break;
                case 8:
                    nameNumber += " eight hundred";
                    break;
                case 9:
                    nameNumber += " nine hundred";
                    break;
            }
            if (number % 100 < 10) {
                switch (number % 100) {
                    case 1:
                        nameNumber += " and one";
                        break;
                    case 2:
                        nameNumber += " and two";
                        break;
                    case 3:
                        nameNumber += " and three";
                        break;
                    case 4:
                        nameNumber += " and foure";
                        break;
                    case 5:
                        nameNumber += " and five";
                        break;
                    case 6:
                        nameNumber += " and six";
                        break;
                    case 7:
                        nameNumber += " and seven";
                        break;
                    case 8:
                        nameNumber += " and eight";
                        break;
                    case 9:
                        nameNumber += " and nine";
                        break;
                }
            } else if (10 <= number % 100 && number % 100 < 20) {
                switch (number % 100) {
                    case 10:
                        nameNumber += " and ten";
                        break;
                    case 11:
                        nameNumber += " and eleven";
                        break;
                    case 12:
                        nameNumber += " and twelve";
                        break;
                    case 13:
                        nameNumber += " and thirteen";
                        break;
                    case 14:
                        nameNumber += " and fourteen";
                        break;
                    case 15:
                        nameNumber += " and fifteen";
                        break;
                    case 16:
                        nameNumber += " and sixteen";
                        break;
                    case 17:
                        nameNumber += " and seventeen";
                        break;
                    case 18:
                        nameNumber += " and eighteen";
                        break;
                    case 19:
                        nameNumber += " and nineteen";
                        break;
                }
            } else if (20 <= number % 100 && number % 100 < 100) {
                switch ((number % 100) / 10) {
                    case 2:
                        nameNumber += " and twenty";
                        break;
                    case 3:
                        nameNumber += " and thirty";
                        break;
                    case 4:
                        nameNumber += " and forty";
                        break;
                    case 5:
                        nameNumber += " and fifty";
                        break;
                    case 6:
                        nameNumber += " and sixty";
                        break;
                    case 7:
                        nameNumber += " and seventy";
                        break;
                    case 8:
                        nameNumber += " and eightty";
                        break;
                    case 9:
                        nameNumber += " and ninety";
                        break;
                }
                switch ((number % 100) % 10) {
                    case 1:
                        nameNumber += " one";
                        break;
                    case 2:
                        nameNumber += " two";
                        break;
                    case 3:
                        nameNumber += " three";
                        break;
                    case 4:
                        nameNumber += " four";
                        break;
                    case 5:
                        nameNumber += " five";
                        break;
                    case 6:
                        nameNumber += " six";
                        break;
                    case 7:
                        nameNumber += " seven";
                        break;
                    case 8:
                        nameNumber += " eight";
                        break;
                    case 9:
                        nameNumber += " nine";
                        break;
                }

            }
        }
        System.out.print("" + nameNumber);
    }
}

