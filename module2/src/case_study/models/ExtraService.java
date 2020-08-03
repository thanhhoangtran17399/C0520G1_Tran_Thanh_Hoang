package case_study.models;

public class ExtraService {
    private String serviceName;
    private String unit;
    private double price;

    public ExtraService(String serviceName, String unit, double price) {
        this.serviceName = serviceName;
        this.unit = unit;
        this.price = price;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
                "serviceName='" + serviceName + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                '}';
    }
}
