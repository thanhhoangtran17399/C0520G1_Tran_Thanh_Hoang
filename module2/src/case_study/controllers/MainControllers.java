package case_study.controllers;

import case_study.commons.FuntionReadAndWriteCSV;
import case_study.commons.Validate;
import case_study.models.Customer;
import case_study.models.Room;
import case_study.models.House;
import case_study.models.Villa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainControllers {

    public static void displayMainMenu() {
        System.out.println("-----FURAMA RESORT MANAGEMENT-----");
        System.out.println("1.Add New Services" + "\n" + "2.Show services" + "\n" + "3.Add New Customer" + "\n" +
                "4.Show Information of Customer" + "\n" + "5.Add New Booking" + "\n" +
                "6.Show Information of Employee" + "\n" + "7.Exit");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                addNewSevices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInformationEmployee();
                displayMainMenu();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("Fail ! Please choose again, enter to continue !");
                scanner.nextLine();
                displayMainMenu();
        }
    }

    private static void addNewSevices() {
        String choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Add New Sevices---");
        System.out.println("1.Add New Villa" + "\n" + "2.Add New House" + "\n" +
                "3.Add New Room" + "\n" + "4.Back to menu" + "\n" +
                "5.Exit");
        choose = scanner.nextLine();
        switch (choose) {

            case "1":
                addNewVila();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail ! Please choose again, enter to continue !");
                scanner.nextLine();
                addNewSevices();
        }
    }

    private static void addNewVila() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Villa> listVilla = new ArrayList<>();
        Villa villa = new Villa();
        do {
            System.out.println("Enter Service name: ");
            villa.setSeviceName(scanner.nextLine());
        } while (!Validate.isValid(villa.getSeviceName(), Validate.SEVICE_NAME_REGEX));
        System.out.println("Enter Rental Costs: ");
        villa.setRentalCosts(scanner.nextDouble());
        do {
            System.out.println("Enter max number of people");
            villa.setMaxNumberOfPeople(scanner.nextInt());
        }while (!Validate.isLessThanAndMoreThan(villa.getMaxNumberOfPeople(), 0, 30));
        scanner.nextLine();
        System.out.println("Enter type of rent");
        villa.setTypeOfRent(scanner.nextLine());
        do {
            System.out.println("Enter ID");
            villa.setId(scanner.nextLine());
        } while (!Validate.isValid(villa.getId(), Validate.SEVICE_ID_REGEX));
        System.out.println("Enter room standard");
        villa.setRoomStandard(scanner.nextLine());
        System.out.println("Enter other description");
        villa.setOtherDescription(scanner.nextLine());
        do {
            System.out.println("Enter pool area: ");
            villa.setPoolArea(scanner.nextDouble());
        } while (!Validate.isMoreThan(villa.getPoolArea(), 30));
        System.out.println("Enter number of floors");
        villa.setNumberOfFloors(scanner.nextInt());
        do {
            System.out.println("Enter area used");
            villa.setAreaUsed(scanner.nextInt());
        } while (!Validate.isMoreThan(villa.getAreaUsed(), 30));
        listVilla.add(villa);
        FuntionReadAndWriteCSV.writeVilla(listVilla);
        System.out.println("Add new villa complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Room> listRoom = new ArrayList<>();
        Room room = new Room();
        do {
            System.out.println("Enter Service name: ");
            room.setSeviceName(scanner.nextLine());
        } while (!Validate.isValid(room.getSeviceName(), Validate.SEVICE_NAME_REGEX));
        System.out.println("Enter Rental Costs: ");
        room.setRentalCosts(scanner.nextDouble());
        do {
            System.out.println("Enter max number of people");
           room.setMaxNumberOfPeople(scanner.nextInt());
        }while (!Validate.isLessThanAndMoreThan(room.getMaxNumberOfPeople(), 0, 30));
        scanner.nextLine();
        System.out.println("Enter type of rent");
        room.setTypeOfRent(scanner.nextLine());
        do {
            System.out.println("Enter ID");
            room.setId(scanner.nextLine());
        } while (!Validate.isValid(room.getId(), Validate.SEVICE_ID_REGEX));
        System.out.println("Enter free service included");
        room.setFreeServiceIncluded(scanner.nextLine());
        do {
            System.out.println("Enter area used");
            room.setAreaUsed(scanner.nextInt());
        }while (!Validate.isMoreThan(room.getAreaUsed(), 30));
        listRoom.add(room);
        FuntionReadAndWriteCSV.writeroom(listRoom);
        System.out.println("Add new room complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<House> listHouse = new ArrayList<>();
        House house = new House();
        do {
            System.out.println("Enter Service name: ");
            house.setSeviceName(scanner.nextLine());
        } while (!Validate.isValid(house.getSeviceName(), Validate.SEVICE_NAME_REGEX));
        System.out.println("Enter Rental Costs: ");
        house.setRentalCosts(scanner.nextDouble());
        do {
            System.out.println("Enter max number of people");
            house.setMaxNumberOfPeople(scanner.nextInt());
        }while (!Validate.isLessThanAndMoreThan(house.getMaxNumberOfPeople(), 0, 30));
        scanner.nextLine();
        System.out.println("Enter type of rent");
        do {
            System.out.println("Enter ID");
            house.setId(scanner.nextLine());
        } while (!Validate.isValid(house.getId(), Validate.SEVICE_ID_REGEX));
        System.out.println("Enter room standard");
        house.setRoomStandard(scanner.nextLine());
        System.out.println("Enter other description");
        house.setOtherDescription(scanner.nextLine());
        System.out.println("Enter number of floors");
        house.setNumberOfFloors(scanner.nextInt());
        do {
            System.out.println("Enter area used");
            house.setAreaUsed(scanner.nextInt());
        }while (!Validate.isMoreThan(house.getAreaUsed(), 30));
        listHouse.add(house);
        FuntionReadAndWriteCSV.writeHouse(listHouse);
        System.out.println("Add new house complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showServices() {
        String choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Show all Villa" + "\n" + "2.Show all House" + "\n" + "3.Show all Room" + "\n" +
                "4.Show All Name Villa Not Duplicate\n" + "5.Show All Name House Not Duplicate" + "\n" + "6.Show All Name Room Not Duplicate" + "\n" +
                "7.Back to menu" + "\n" + "8.Exit");
        choose = scanner.nextLine();
        switch (choose) {
            case "1":
                showAllVilla();
                break;
            case "2":
                showAllHouse();
                break;
            case "3":
                showAllRoom();
                break;
            case "4":
                showAllNameVillaNotDuplicate();
                break;
            case "5":
                showAllNameHouseNotDuplicate();
                break;
            case "6":
                ShowAllNameRoomNotDuplicate();
                break;
            case "7":
                displayMainMenu();
                break;
            case "8":
                System.exit(0);
                break;
            default:
                System.out.println("Fail ! Please choose again, enter to continue !");
                scanner.nextLine();
                showServices();
        }
    }

    private static void showAllVilla() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Villa> listVilla;
        listVilla = FuntionReadAndWriteCSV.readVilla();
        for (Villa villa : listVilla) {
            System.out.println("--------------------------");
            villa.showInfor();
        }
        System.out.println("Show all villa complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showAllHouse() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Room> listRoom;
        listRoom = FuntionReadAndWriteCSV.readHouse();
        for (Room room : listRoom) {
            System.out.println("--------------------------");
            room.showInfor();
        }
        System.out.println("Show all house complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showAllRoom() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<House> listHouse;
        listHouse = FuntionReadAndWriteCSV.readRoom();
        for (House house : listHouse) {
            System.out.println("--------------------------");
            house.showInfor();
        }
        System.out.println("Show all room complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showAllNameVillaNotDuplicate() {

    }

    private static void showAllNameHouseNotDuplicate() {

    }

    private static void ShowAllNameRoomNotDuplicate() {

    }

    private static void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> listCustomer = new ArrayList<>();
        Customer customer = new Customer();
        do{
            System.out.println("Enter name: ");
            customer.setName(scanner.nextLine());
        }while (!Validate.isValid(customer.getName(), Validate.NAME_CUSTOMER));
        do {
            System.out.println("Enter birthday: ");
            customer.setBirthday(scanner.nextLine());
        }while (!Validate.isValid(customer.getBirthday(), Validate.BIRTHDAY_CUSTOMER));

        System.out.println("Enter gender: ");
        customer.setGender(scanner.nextLine());
        do {
            System.out.println("Enter identity card: ");
            customer.setCmnd(scanner.nextLine());
        }while (!Validate.isValid(customer.getCmnd(), Validate.ID_CARD_CUSTOMER));
        System.out.println("Enter phone number: ");
        customer.setPhoneNumber(scanner.nextInt());
        do{
            System.out.println("Enter email: ");
            customer.setEmail(scanner.nextLine());
        }while (!Validate.isValid(customer.getEmail(), Validate.EMAIL_CUSTOMER));
        System.out.println("Enter type customer: ");
        customer.setTypeCustomer(scanner.nextLine());
        System.out.println("Enter use services");
        listCustomer.add(customer);
        FuntionReadAndWriteCSV.WriteCustomer(listCustomer);
        System.out.println("Add new customer complete, enter to continue !");
        scanner.nextLine();
        addNewSevices();
    }

    private static void showInformationCustomer() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> listCustomer;
        listCustomer = FuntionReadAndWriteCSV.readCustomer();
        Collections.sort(listCustomer);
        for (Customer customer : listCustomer) {
            System.out.println("--------------------------");
            customer.showInfor();
        }
        System.out.println("Show information customer complete, enter to continue !");
        scanner.nextLine();
        addNewSevices();
    }

    private static void addNewBooking() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add new booking complete, enter to continue !");
        scanner.nextLine();
        addNewSevices();
    }

    private static void showInformationEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Show information employee complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void main(String[] args) {
        displayMainMenu();
    }

}

