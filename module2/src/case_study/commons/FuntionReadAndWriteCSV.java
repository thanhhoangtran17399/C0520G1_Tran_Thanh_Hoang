package case_study.commons;

import case_study.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FuntionReadAndWriteCSV {
    public static final String PATH1 = "src/case_study/data/Villa.csv";
    public static final String PATH2 = "src/case_study/data/House.csv";
    public static final String PATH3 = "src/case_study/data/Room.csv";
    public static final String PATH4 = "src/case_study/data/Customer.csv";
    public static final String PATH5 = "src/case_study/data/Employee.csv";
    public static final String PATH6 = "src/case_study/data/Booking.csv";
    public static final String COMA = ",";
    public static final String NEW_LINE = "\n";

    public static void writeVilla(ArrayList<Villa> listVilla) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH1, true);
            for (Villa villa : listVilla) {
                writer.append(villa.getSeviceName());
                writer.append(COMA);
                writer.append(String.valueOf(villa.getRentalCosts()));
                writer.append(COMA);
                writer.append(String.valueOf(villa.getMaxNumberOfPeople()));
                writer.append(COMA);
                writer.append(villa.getTypeOfRent());
                writer.append(COMA);
                writer.append(villa.getId());
                writer.append(COMA);
                writer.append(villa.getRoomStandard());
                writer.append(COMA);
                writer.append(villa.getOtherDescription());
                writer.append(COMA);
                writer.append(String.valueOf(villa.getPoolArea()));
                writer.append(COMA);
                writer.append(String.valueOf(villa.getNumberOfFloors()));
                writer.append(COMA);
                writer.append(String.valueOf(villa.getAreaUsed()));
                writer.append(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println("Error in  writeVilla");
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void writeroom(ArrayList<Room> listRoom) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH3, true);
            for (Room room : listRoom) {
                writer.append(room.getSeviceName());
                writer.append(COMA);
                writer.append(String.valueOf(room.getRentalCosts()));
                writer.append(COMA);
                writer.append(String.valueOf(room.getMaxNumberOfPeople()));
                writer.append(COMA);
                writer.append(room.getTypeOfRent());
                writer.append(COMA);
                writer.append(room.getId());
                writer.append(COMA);
                writer.append(room.getExtraService().getExtraserviceName());
                writer.append(COMA);
                writer.append(room.getExtraService().getUnit());
                writer.append(COMA);
                writer.append(String.valueOf(room.getExtraService().getPrice()));
                writer.append(COMA);
                writer.append(String.valueOf(room.getAreaUsed()));
                writer.append(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println("Error in  writeRoom");
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void writeHouse(ArrayList<House> listHouse) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH2, true);
            for (House house : listHouse) {
                writer.append(house.getSeviceName());
                writer.append(COMA);
                writer.append(String.valueOf(house.getRentalCosts()));
                writer.append(COMA);
                writer.append(String.valueOf(house.getMaxNumberOfPeople()));
                writer.append(COMA);
                writer.append(house.getTypeOfRent());
                writer.append(COMA);
                writer.append(house.getId());
                writer.append(COMA);
                writer.append(house.getRoomStandard());
                writer.append(COMA);
                writer.append(house.getOtherDescription());
                writer.append(COMA);
                writer.append(String.valueOf(house.getNumberOfFloors()));
                writer.append(COMA);
                writer.append(String.valueOf(house.getAreaUsed()));
                writer.append(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println("Error in  writeHouse");
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void WriteCustomer(ArrayList<Customer> listCustomer) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH4, true);
            for (Customer customer : listCustomer) {
                writer.append(customer.getName());
                writer.append(COMA);
                writer.append(customer.getBirthday());
                writer.append(COMA);
                writer.append(customer.getGender());
                writer.append(COMA);
                writer.append(customer.getCmnd());
                writer.append(COMA);
                writer.append(String.valueOf(customer.getPhoneNumber()));
                writer.append(COMA);
                writer.append(customer.getEmail());
                writer.append(COMA);
                writer.append(customer.getTypeCustomer());
                writer.append(COMA);
                //writer.append(customer.getUseServices());
                writer.append(NEW_LINE);
            }
        } catch (IOException e) {
            System.out.println("Error in  writeRoom");
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void writeCustomerToFileBoooking(Customer customer) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH6, true);
                writer.append(customer.getName());
                writer.append(COMA);
                writer.append(customer.getBirthday());
                writer.append(COMA);
                writer.append(customer.getGender());
                writer.append(COMA);
                writer.append(customer.getCmnd());
                writer.append(COMA);
                writer.append(String.valueOf(customer.getPhoneNumber()));
                writer.append(COMA);
                writer.append(customer.getEmail());
                writer.append(COMA);
                writer.append(customer.getTypeCustomer());
                writer.append(COMA);
                writer.append(customer.getUseServices().getId());
                writer.append(COMA);
                writer.append(customer.getUseServices().getSeviceName());
                writer.append(COMA);
                writer.append(String.valueOf(customer.getUseServices().getRentalCosts()));
                writer.append(COMA);
                writer.append(String.valueOf(customer.getUseServices().getMaxNumberOfPeople()));
                writer.append(COMA);
                writer.append(customer.getUseServices().getTypeOfRent());
                writer.append(COMA);
                writer.append(customer.getUseServices().getId());
                writer.append(COMA);
                writer.append(String.valueOf(customer.getUseServices().getAreaUsed()));
                writer.append(NEW_LINE);
        } catch (IOException e) {
            System.out.println("Error in  writeRoom");
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<Villa> readVilla() {
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH1));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                Villa villa = new Villa();
                villa.setSeviceName(splitData[0]);
                villa.setRentalCosts(Double.parseDouble((splitData[1])));
                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[2]));
                villa.setTypeOfRent(splitData[3]);
                villa.setId(splitData[4]);
                villa.setRoomStandard(splitData[5]);
                villa.setOtherDescription(splitData[6]);
                villa.setPoolArea(Double.parseDouble(splitData[7]));
                villa.setNumberOfFloors(Integer.parseInt(splitData[8]));
                villa.setAreaUsed(Double.parseDouble(splitData[9]));
                listVilla.add(villa);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listVilla;
    }

    public static ArrayList<Room> readRoom() {
        BufferedReader br = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH3));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                Room room = new Room();
                room.setSeviceName(splitData[0]);
                room.setRentalCosts(Double.parseDouble(splitData[1]));
                room.setMaxNumberOfPeople(Integer.parseInt(splitData[2]));
                room.setTypeOfRent(splitData[3]);
                room.setId(splitData[4]);
                //room.setExtraService(new ExtraService(splitData[5], splitData[6], Double.parseDouble(splitData[7])));
                room.setAreaUsed(Integer.parseInt(splitData[5]));
                listRoom.add(room);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listRoom;
    }

    public static ArrayList<House> readHouse() {
        BufferedReader br = null;
        ArrayList<House> listHouse = new ArrayList<House>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH2));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                House house = new House();
                house.setSeviceName(splitData[0]);
                house.setRentalCosts(Double.parseDouble(splitData[1]));
                house.setMaxNumberOfPeople(Integer.parseInt(splitData[2]));
                house.setTypeOfRent(splitData[3]);
                house.setId(splitData[4]);
                house.setRoomStandard(splitData[5]);
                house.setOtherDescription(splitData[6]);
                house.setNumberOfFloors(Integer.parseInt(splitData[7]));
                house.setAreaUsed(Double.parseDouble(splitData[8]));
                listHouse.add(house);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listHouse;
    }

    public static ArrayList<Customer> readCustomer() {
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH4));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                Customer customer = new Customer();
                customer.setName(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setCmnd(splitData[3]);
                customer.setPhoneNumber(Integer.parseInt(splitData[4]));
                customer.setEmail(splitData[5]);
                customer.setTypeCustomer(splitData[6]);
                customer.setUseServices(null);
                listCustomer.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listCustomer;
    }

    public static Map<String, Employee> readEmployee() {
        BufferedReader br = null;
        Map<String,Employee> employeeMap = new HashMap<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH5));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                Employee employee = new Employee();
                employee.setId(splitData[0]);
                employee.setNameEmloyee(splitData[1]);
                employee.setAgeEmployee(splitData[2]);
                employee.setAddress(splitData[3]);
                employeeMap.put(employee.getId(), employee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return employeeMap;
    }


}
