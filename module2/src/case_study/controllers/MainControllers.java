package case_study.controllers;

import case_study.commons.*;
import case_study.models.*;

import java.util.*;
import java.util.regex.Pattern;

public class MainControllers {

    public static void displayMainMenu() {
        System.out.println("-----FURAMA RESORT MANAGEMENT-----");
        System.out.println("1.Add New Services" + "\n" + "2.Show services" + "\n" + "3.Add New Customer" + "\n" +
                "4.Show Information of Customer" + "\n" + "5.Add New Booking" + "\n" +
                "6.Show Information of Employee" + "\n" + "7.Show Queue Customer" + "\n" + "8.search employee from Cabinets" + "\n" + "9.Exit");
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
                System.out.println("Show information customer complete, enter to continue !");
                scanner.nextLine();
                displayMainMenu();
                break;
            case "7":
                showQueueCustomer();
                break;
            case "8":
                FilingCabinets.pushEmployeeToCabinets();
                FilingCabinets.searchEmployee();
                break;
            case "9":
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
        } while (!Validate.isLessThanAndMoreThan(villa.getMaxNumberOfPeople(), 0, 20));
        scanner.nextLine();
        System.out.println("Enter type of rent");
        villa.setTypeOfRent(scanner.nextLine());
        do {
            System.out.println("Enter ID");
            villa.setId(scanner.nextLine());
        } while (!Validate.isValid(villa.getId(), Validate.SEVICE_ID_VILLA_REGEX));
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
        } while (!Validate.isLessThanAndMoreThan(room.getMaxNumberOfPeople(), 0, 20));
        scanner.nextLine();
        System.out.println("Enter type of rent");
        room.setTypeOfRent(scanner.nextLine());
        do {
            System.out.println("Enter ID");
            room.setId(scanner.nextLine());
        } while (!Validate.isValid(room.getId(), Validate.SEVICE_ID_ROOM_REGEX));
        String extraServiceName = null;
        do {
            System.out.println("Enter name extra service: ");
            extraServiceName = scanner.nextLine();
        } while (!Validate.isValid(extraServiceName, Validate.EXTRA_SERVICE_NAME_REGEX));
        System.out.println("Enter unit of extra service: ");
        String unit = scanner.nextLine();
        System.out.println("Enter price of extra service: ");
        double price = scanner.nextDouble();
        room.setExtraService(new ExtraService(extraServiceName, unit, price));
        do {
            System.out.println("Enter area used");
            room.setAreaUsed(scanner.nextInt());
        } while (!Validate.isMoreThan(room.getAreaUsed(), 30));
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
        } while (!Validate.isLessThanAndMoreThan(house.getMaxNumberOfPeople(), 0, 20));
        scanner.nextLine();
        System.out.println("Enter type of rent");
        house.setTypeOfRent(scanner.nextLine());
        do {
            System.out.println("Enter ID");
            house.setId(scanner.nextLine());
        } while (!Validate.isValid(house.getId(), Validate.SEVICE_ID_HOUSE_REGEX));
        System.out.println("Enter house standard");
        house.setRoomStandard(scanner.nextLine());
        System.out.println("Enter other description");
        house.setOtherDescription(scanner.nextLine());
        System.out.println("Enter number of floors");
        house.setNumberOfFloors(scanner.nextInt());
        do {
            System.out.println("Enter area used");
            house.setAreaUsed(scanner.nextInt());
        } while (!Validate.isMoreThan(house.getAreaUsed(), 30));
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
                System.out.println("Show all villa complete, enter to continue !");
                scanner.nextLine();
                displayMainMenu();
                break;
            case "2":
                showAllHouse();
                System.out.println("Show all house complete, enter to continue !");
                scanner.nextLine();
                displayMainMenu();
                break;
            case "3":
                showAllRoom();
                System.out.println("Show all room complete, enter to continue !");
                scanner.nextLine();
                displayMainMenu();
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
        for (int i = 0; i < listVilla.size(); i++) {
            System.out.println("--------------------------");
            System.out.println((i + 1) + ".");
            listVilla.get(i).showInfor();
        }
    }

    private static void showAllRoom() {
        ArrayList<Room> listRoom;
        listRoom = FuntionReadAndWriteCSV.readRoom();
        for (int i = 0; i < listRoom.size(); i++) {
            System.out.println("--------------------------");
            System.out.println((i + 1) + ".");
            listRoom.get(i).showInfor();
        }
    }

    private static void showAllHouse() {
        ArrayList<House> listHouse;
        listHouse = FuntionReadAndWriteCSV.readHouse();
        for (int i = 0; i < listHouse.size(); i++) {
            System.out.println("--------------------------");
            System.out.println((i + 1) + ".");
            listHouse.get(i).showInfor();
        }
    }

    private static void showAllNameVillaNotDuplicate() {
        Set<String> stringSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Villa> listVilla;
        listVilla = FuntionReadAndWriteCSV.readVilla();
        for (Villa villa : listVilla) {
            stringSet.add(villa.getSeviceName());
        }
        for (String name : stringSet) {
            System.out.println(name);
        }
        System.out.println("Show all name villa not duplicate complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showAllNameHouseNotDuplicate() {
        Set<String> stringSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<House> listHouse;
        listHouse = FuntionReadAndWriteCSV.readHouse();
        for (House house : listHouse) {
            stringSet.add(house.getSeviceName());
        }
        for (String name : stringSet) {
            System.out.println(name);
        }
        System.out.println("Show all name house not duplicate complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void ShowAllNameRoomNotDuplicate() {
        Set<String> stringSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Room> listRoom;
        listRoom = FuntionReadAndWriteCSV.readRoom();
        for (Room room : listRoom) {
            stringSet.add(room.getSeviceName());
        }
        for (String name : stringSet) {
            System.out.println(name);
        }
        System.out.println("Show all name room not duplicate complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> listCustomer = new ArrayList<>();
        Customer customer = new Customer();
        String regexName = "^([A-Z][a-z]{1,}[\\s])[A-Z][a-z]*(([\\s][A-Z][a-z]*){0,4})$";
        String regexEmail = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)";
        String regexBirthday = "[0-9]{2}/[0-9]{2}/(19[0-9][0-9]|20(00|01|02))";
        String regexId = "[\\d]{3} [\\d]{3} [\\d]{3}";

        while (true) {
            try {
                System.out.println("Enter name: ");
                customer.setName(scanner.nextLine());
                if (!Pattern.matches(regexName, customer.getName())) {
                    throw new NameExeption("Your name must be in the format: Abc Abc Abc, enter again !!!");
                }
                break;
            } catch (NameExeption e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter birthday: ");
                customer.setBirthday(scanner.nextLine());
                if (!Pattern.matches(regexBirthday, customer.getBirthday())) {
                    throw new BirthdayException("The birthday must be in the format: xx/xx/xxxx, enter again !!! ");
                }
                break;
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter gender: ");
        customer.setGender(scanner.nextLine());

        while (true) {
            try {
                System.out.println("Enter identity card: ");
                customer.setCmnd(scanner.nextLine());
                if (!Pattern.matches(regexId, customer.getCmnd())) {
                    throw new IdCardException("The ID number must be in the format: xxx xxx xxx, enter again !!!");
                }
                break;
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter phone number: ");
        customer.setPhoneNumber(scanner.nextInt());
        scanner.nextLine();
        while (true) {
            try {
                System.out.println("Enter email: ");
                customer.setEmail(scanner.nextLine());
                if (!Pattern.matches(regexEmail, customer.getEmail())) {
                    throw new EmailException("The email must be in the format: abc@abc.abc, enter again !!! ");
                }
                break;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter type customer: ");
        customer.setTypeCustomer(scanner.nextLine());
        listCustomer.add(customer);
        FuntionReadAndWriteCSV.WriteCustomer(listCustomer);
        System.out.println("Add new customer complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showInformationCustomer() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> listCustomer;
        listCustomer = FuntionReadAndWriteCSV.readCustomer();
        Collections.sort(listCustomer);
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println("--------------------------");
            System.out.println((i + 1) + ".");
            listCustomer.get(i).showInfor();
        }
    }

    private static void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> listCustomer;
        listCustomer = FuntionReadAndWriteCSV.readCustomer();
        System.out.println("----List customer to booking----");
        showInformationCustomer();
        System.out.println("Enter customers to booking: ");
        int chooseCustomer = scanner.nextInt();
        if (chooseCustomer < listCustomer.size()) {
            System.out.println("1. Booking Villa\n" +
                    "2. Booking House\n" +
                    "3. Booking Room");
            scanner.nextLine();
            System.out.println("Enter your choose: ");
            String choose = scanner.nextLine();
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
                case "8":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Fail ! Please choose again, enter to continue !");
                    scanner.nextLine();
                    addNewBooking();
            }


        }
        System.out.println("Add new booking complete, enter to continue !");
        scanner.nextLine();
        addNewSevices();
    }

    private static void showInformationEmployee() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Employee> employeeMap = FuntionReadAndWriteCSV.readEmployee();

        for (Map.Entry<String, Employee> employeeEntry : employeeMap.entrySet()) {
            System.out.println(employeeEntry.getKey() + " " + employeeEntry.getValue().toString());
        }
        System.out.println("Show information employee complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void showQueueCustomer() {
        Scanner scanner = new Scanner(System.in);
        Queue<Customer> customerQueue = new LinkedList<>();
        List<Customer> listCustomer = FuntionReadAndWriteCSV.readCustomer();
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println((i + 1) + "." + listCustomer.get(i).getName());
        }
        while (customerQueue.size() < 3) {
            System.out.println("Enter id customer: ");
            int id = scanner.nextInt();
            customerQueue.add(listCustomer.get(id - 1));
            System.out.println("sold tickets is successfully!!!");
        }
        System.out.println("tickets is sold out!!!");
        System.out.println("---List customer buy ticket---");
        Customer customer = null;
        while (!customerQueue.isEmpty()) {
            customer = customerQueue.poll();
            customer.showInfor();
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }

}

