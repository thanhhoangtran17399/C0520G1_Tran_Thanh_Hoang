package case_study.models;

public abstract class Services {
    private String seviceName;
    private double areaUsed;
    private double rentalCosts;
    private int MaxNumberOfPeople;
    private String typeOfRent;
    private String id;

    public Services(String seviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent, String id) {
        this.seviceName = seviceName;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        MaxNumberOfPeople = maxNumberOfPeople;
        this.typeOfRent = typeOfRent;
        this.id = id;
    }

    public Services() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeviceName() {
        return seviceName;
    }

    public void setSeviceName(String seviceName) {
        this.seviceName = seviceName;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return MaxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        MaxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return "Services{" +
                "seviceName='" + seviceName + '\'' +
                ", areaUsed=" + areaUsed +
                ", rentalCosts=" + rentalCosts +
                ", MaxNumberOfPeople=" + MaxNumberOfPeople +
                ", typeOfRent='" + typeOfRent + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public abstract void showInfor();

}
