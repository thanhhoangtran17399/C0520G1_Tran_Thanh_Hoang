package model;

public class Service {
    private int serviceId;
    private String serviceName;
    private int serviceArea;
    private double serviceCode;
    private int serviceMaxPeople;
    private int rentTypeId;
    private int serviceTypeId;
    private String standardRoom;
    private String descriptionOtherConvenionce;
    private double poolArea;
    private int numberOfFloors;

    public Service(int serviceId, String serviceName, int serviceArea, double serviceCode, int serviceMaxPeople, int rentTypeId, int serviceTypeId, String standard_room, String description_other_convenionce, double pool_area, int number_of_floors) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCode = serviceCode;
        this.serviceMaxPeople = serviceMaxPeople;
        this.rentTypeId = rentTypeId;
        this.serviceTypeId = serviceTypeId;
        this.standardRoom = standard_room;
        this.descriptionOtherConvenionce = description_other_convenionce;
        this.poolArea = pool_area;
        this.numberOfFloors = number_of_floors;
    }

    public Service() {

    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(double serviceCode) {
        this.serviceCode = serviceCode;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenionce() {
        return descriptionOtherConvenionce;
    }

    public void setDescriptionOtherConvenionce(String descriptionOtherConvenionce) {
        this.descriptionOtherConvenionce = descriptionOtherConvenionce;
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
}
