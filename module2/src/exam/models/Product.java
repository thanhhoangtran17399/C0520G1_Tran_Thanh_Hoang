package exam.models;

public abstract class Product {
    private int id;
    private String productCode;
    private String nameProduct;
    private double cost;
    private double amount;
    private String producer;

    public Product(int id, String productCode, String nameProduct, double cost, double amount, String producer) {
        this.id = id;
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.amount = amount;
        this.producer = producer;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", cost='" + cost + '\'' +
                ", amount=" + amount +
                ", producer='" + producer + '\'' +
                '}';
    }
}
