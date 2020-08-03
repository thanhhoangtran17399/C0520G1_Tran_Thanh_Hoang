package case_study.models;

public class Room extends Services{
    private String roomStandard;
    private String otherDescription;
    private int numberOfFloors;

    public Room(String seviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent, String id, String roomStandard, String otherDescription, int numberOfFloors) {
        super(seviceName, areaUsed, rentalCosts, maxNumberOfPeople, typeOfRent, id);
        this.roomStandard = roomStandard;
        this.otherDescription = otherDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public Room() {

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomStandard='" + roomStandard + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
