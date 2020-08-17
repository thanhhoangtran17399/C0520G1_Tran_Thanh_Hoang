package exam.models;

public class ExportProduct extends Product {
    private double exportCost;
    private String countryImport;

    public ExportProduct(int id, String productCode, String nameProduct, double cost, double amount, String producer, double exportCost, String countryImport) {
        super(id, productCode, nameProduct, cost, amount, producer);
        this.exportCost = exportCost;
        this.countryImport = countryImport;
    }

    public ExportProduct() {

    }

    public double getExportCost() {
        return exportCost;
    }

    public void setExportCost(double exportCost) {
        this.exportCost = exportCost;
    }

    public String getCountryImport() {
        return countryImport;
    }

    public void setCountryImport(String countryImport) {
        this.countryImport = countryImport;
    }

    @Override
    public String toString() {
        return "ExportProduct{" +
                "exportCost=" + exportCost +
                ", countryImport='" + countryImport + '\'' +
                "} " + super.toString();
    }
}
