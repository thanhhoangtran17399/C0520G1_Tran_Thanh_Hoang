package case_study.commons;

import case_study.models.Customer;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.ArrayList;

public class FuntionReadAndWriteCSV {
    public static final String PATH1 = "src/case_study/data/Villa.csv";
    public static final String PATH2 = "src/case_study/data/House.csv";
    public static final String PATH3 = "src/case_study/data/Room.csv";
    public static final String PATH4 = "src/case_study/data/Customer.csv";
    public static final String COMA = ",";
    public static final String NEW_LINE = "\n";

    public static void writeVilla(ArrayList<Villa> listVilla) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH1);
            for (Villa villa : listVilla) {
                writer.append(villa.getSeviceName());
                writer.append(COMA);
                writer.append((char) villa.getRentalCosts());
                writer.append(COMA);
                writer.append((char) villa.getMaxNumberOfPeople());
                writer.append(COMA);
                writer.append(villa.getTypeOfRent());
                writer.append(COMA);
                writer.append(villa.getId());
                writer.append(COMA);
                writer.append(villa.getRoomStandard());
                writer.append(COMA);
                writer.append(villa.getOtherDescription());
                writer.append(COMA);
                writer.append((char) villa.getPoolArea());
                writer.append(COMA);
                writer.append((char) villa.getNumberOfFloors());
                writer.append(COMA);
                writer.append((char) villa.getAreaUsed());
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

    public static void writeHouse(ArrayList<House> listHouse) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH2);
            for (House house : listHouse) {
                writer.append(house.getSeviceName());
                writer.append(COMA);
                writer.append((char) house.getRentalCosts());
                writer.append(COMA);
                writer.append((char) house.getMaxNumberOfPeople());
                writer.append(COMA);
                writer.append(house.getTypeOfRent());
                writer.append(COMA);
                writer.append(house.getId());
                writer.append(COMA);
                writer.append(house.getFreeServiceIncluded());
                writer.append(COMA);
                writer.append((char) house.getAreaUsed());
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

    public static void writeRoom(ArrayList<Room> listRoom) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH3);
            for (Room room : listRoom) {
                writer.append(room.getSeviceName());
                writer.append(COMA);
                writer.append((char) room.getRentalCosts());
                writer.append(COMA);
                writer.append((char) room.getMaxNumberOfPeople());
                writer.append(COMA);
                writer.append(room.getTypeOfRent());
                writer.append(COMA);
                writer.append(room.getId());
                writer.append(COMA);
                writer.append(room.getRoomStandard());
                writer.append(COMA);
                writer.append(room.getOtherDescription());
                writer.append(COMA);
                writer.append((char) room.getNumberOfFloors());
                writer.append(COMA);
                writer.append((char) room.getAreaUsed());
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

    public static void WriteCustomer(ArrayList<Customer> listCustomer){
        FileWriter writer = null;
        try {
            writer = new FileWriter(PATH3);
            for (Customer customer: listCustomer) {
                writer.append(customer.getName());
                writer.append(COMA);
                writer.append(customer.getBirthday());
                writer.append(COMA);
                writer.append(customer.getGender());
                writer.append(COMA);
                writer.append(customer.getCmnd());
                writer.append(COMA);
                writer.append(customer.getPhoneNumber());
                writer.append(COMA);
                writer.append(customer.getEmail());
                writer.append(COMA);
                writer.append(customer.getTypeCustomer());
                writer.append(COMA);
                writer.append(customer.getUseServices());
                writer.append(COMA);
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
    public static ArrayList<Villa> readVilla(){
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH1));

            while ((line = br.readLine()) != null){
                String[] splitData = line.split(",");
                Villa villa = new Villa();
                villa.setSeviceName(splitData[0]);
                villa.setRentalCosts((splitData[1]));
                villa.setMaxNumberOfPeople(splitData[2]);
                villa.setTypeOfRent(splitData[3]);
                villa.setId(splitData[4]);
                villa.setRoomStandard(splitData[5]);
                villa.setOtherDescription(splitData[6]);
                villa.setPoolArea(splitData[7]);
                villa.setNumberOfFloors(splitData[8]);
                villa.setAreaUsed(splitData[9]);
                listVilla.add(villa);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listVilla;
    }

    public static ArrayList<House> readHouse(){
        BufferedReader br = null;
        ArrayList<House> listHouse = new ArrayList<House>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH2));

            while ((line = br.readLine()) != null){
                String[] splitData = line.split(",");
                House house = new House();
                house.setSeviceName(splitData[0]);
                house.setRentalCosts(splitData[1]);
                house.setMaxNumberOfPeople(splitData[2]);
                house.setTypeOfRent(splitData[3]);
                house.setId(splitData[4]);
                house.setFreeServiceIncluded(splitData[5]);
                house.setAreaUsed(Integer.parseInt(splitData[6]));
                listHouse.add(house);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listHouse;
    }

    public static ArrayList<Room> readRoom(){
        BufferedReader br = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();
        try {
            String line;
            br = new BufferedReader(new FileReader(PATH3));

            while ((line = br.readLine()) != null){
                String[] splitData = line.split(",");
                Room room = new Room();
                room.setSeviceName(splitData[0]);
                room.setRentalCosts(splitData[1]);
                room.setMaxNumberOfPeople(splitData[2]);
                room.setTypeOfRent(splitData[3]);
                room.setId(splitData[4]);
                room.setAreaUsed(splitData[5]);
                listRoom.add(room);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listRoom;
    }

    public static ArrayList<Customer> readCustomer(){
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader(new FileReader());

            while ((line = br.readLine()) != null){
                String[] splitData = line.split(",");
                Customer customer = new Customer();
                customer.setName(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setCmnd(splitData[3]);
                customer.setPhoneNumber(splitData[4]);
                customer.setEmail(splitData[5]);
                customer.setTypeCustomer(splitData[6]);
                customer.setUseServices(splitData[7]);
                listCustomer.add(customer);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listCustomer;
    }
}
