package case_study.models;

public class House extends Services {
    private String freeServiceIncluded;

    public House(String seviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent, String id, String freeServiceIncluded) {
        super(seviceName, areaUsed, rentalCosts, maxNumberOfPeople, typeOfRent, id);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public House() {

    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "House{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                "} " + super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
