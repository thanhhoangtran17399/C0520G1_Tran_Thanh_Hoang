package case_study.models;

public class Villa extends Services{
    private String roomStandard;
    private String otherDescription;
    private double poolArea;
    private int numberOfFloors;

    public Villa(String seviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent, String id, String roomStandard, String otherDescription, double poolArea, int numberOfFloors) {
        super(seviceName, areaUsed, rentalCosts, maxNumberOfPeople, typeOfRent, id);
        this.roomStandard = roomStandard;
        this.otherDescription = otherDescription;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa() {

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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
