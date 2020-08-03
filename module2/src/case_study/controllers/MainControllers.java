package case_study.controllers;

import case_study.commons.FuntionReadAndWriteCSV;
import case_study.models.Customer;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.util.ArrayList;
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
                addNewSevices();
                break;
            case "2":
                addNewHouse();
                addNewSevices();
                break;
            case "3":
                addNewRoom();
                addNewSevices();
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
        System.out.println("Enter Service name: ");
        villa.setSeviceName(scanner.nextLine());
        System.out.println("Enter Rental Costs: ");
        villa.setRentalCosts(scanner.nextDouble());
        System.out.println("Enter max number of people");
        villa.setMaxNumberOfPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter type of rent");
        villa.setTypeOfRent(scanner.nextLine());
        System.out.println("Enter ID");
        villa.setId(scanner.nextLine());
        System.out.println("Enter room standard");
        villa.setRoomStandard(scanner.nextLine());
        System.out.println("Enter other description");
        villa.setOtherDescription(scanner.nextLine());
        System.out.println("Enter pool area: ");
        villa.setPoolArea(scanner.nextDouble());
        System.out.println("Enter number of floors");
        villa.setNumberOfFloors(scanner.nextInt());
        System.out.println("Enter area used");
        villa.setAreaUsed(scanner.nextInt());
        listVilla.add(villa);
        FuntionReadAndWriteCSV.writeVilla(listVilla);
    }

    private static void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<House> listHouse = new ArrayList<>();
        House house = new House();
        System.out.println("Enter Service name: ");
        house.setSeviceName(scanner.nextLine());
        System.out.println("Enter Rental Costs: ");
        house.setRentalCosts(scanner.nextDouble());
        System.out.println("Enter max number of people");
        house.setMaxNumberOfPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter type of rent");
        house.setTypeOfRent(scanner.nextLine());
        System.out.println("Enter ID");
        house.setId(scanner.nextLine());
        System.out.println("Enter free service included");
        house.setFreeServiceIncluded(scanner.nextLine());
        System.out.println("Enter area used");
        house.setAreaUsed(scanner.nextInt());
        listHouse.add(house);
        FuntionReadAndWriteCSV.writeHouse(listHouse);
    }

    private static void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Room> listRoom = new ArrayList<>();
        Room room = new Room();
        System.out.println("Enter Service name: ");
        room.setSeviceName(scanner.nextLine());
        System.out.println("Enter Rental Costs: ");
        room.setRentalCosts(scanner.nextDouble());
        System.out.println("Enter max number of people");
        room.setMaxNumberOfPeople(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter type of rent");
        room.setTypeOfRent(scanner.nextLine());
        System.out.println("Enter ID");
        room.setId(scanner.nextLine());
        System.out.println("Enter room standard");
        room.setRoomStandard(scanner.nextLine());
        System.out.println("Enter other description");
        room.setOtherDescription(scanner.nextLine());
        System.out.println("Enter number of floors");
        room.setNumberOfFloors(scanner.nextInt());
        System.out.println("Enter area used");
        room.setAreaUsed(scanner.nextInt());
        listRoom.add(room);
        FuntionReadAndWriteCSV.writeRoom(listRoom);
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
        ArrayList<Villa> listVilla;
        listVilla = FuntionReadAndWriteCSV.readVilla();
        for (Villa villa : listVilla) {
            System.out.println("--------------------------");
            villa.showInfor();
            System.out.println("--------------------------");
        }
    }

    private static void showAllHouse() {
        ArrayList<House> listHouse;
        listHouse = FuntionReadAndWriteCSV.readHouse();
        for (House house : listHouse) {
            System.out.println("--------------------------");
            house.showInfor();
            System.out.println("--------------------------");
        }
    }

    private static void showAllRoom() {
        ArrayList<Room> listRoom;
        listRoom = FuntionReadAndWriteCSV.readRoom();
        for (Room room : listRoom) {
            System.out.println("--------------------------");
            room.showInfor();
            System.out.println("--------------------------");
        }
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

        System.out.println("Add new customer complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showInformationCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Show information customer complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewBooking() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add new booking complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
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

