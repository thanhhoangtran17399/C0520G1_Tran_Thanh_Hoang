package case_study.models;

public class Room extends Services {
    private ExtraService extraService;

    public Room(String seviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent, String id, ExtraService extraService) {
        super(seviceName, areaUsed, rentalCosts, maxNumberOfPeople, typeOfRent, id);
        this.extraService = extraService;
    }

    public Room() {

    }

    public ExtraService getExtraService() {
        return extraService;
    }

    public void setExtraService(ExtraService extraService) {
        this.extraService = extraService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "extraService=" + extraService +
                "} " + super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
