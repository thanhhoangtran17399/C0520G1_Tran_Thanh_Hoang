package case_study.models;

public class ExtraService {
    private String extraserviceName;
    private String unit;
    private double price;

    public ExtraService(String extraserviceName, String unit, double price) {
        this.extraserviceName = extraserviceName;
        this.unit = unit;
        this.price = price;
    }

    public String getExtraserviceName() {
        return extraserviceName;
    }

    public void setExtraserviceName(String extraserviceName) {
        this.extraserviceName = extraserviceName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ExtraService{" +
                "serviceName='" + extraserviceName + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                '}';
    }
}
