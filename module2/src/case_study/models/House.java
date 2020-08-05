package case_study.models;

public class House extends Services{
    private String roomStandard;
    private String otherDescription;
    private int numberOfFloors;

    public House(String seviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent, String id, String roomStandard, String otherDescription, int numberOfFloors) {
        super(seviceName, areaUsed, rentalCosts, maxNumberOfPeople, typeOfRent, id);
        this.roomStandard = roomStandard;
        this.otherDescription = otherDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {

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
        return "House{" +
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
