package exam.models;

public class ImportProduct extends Product {
    private double importCost;
    private String provinceImport;
    private double taxImport;

    public ImportProduct(int id, String productCode, String nameProduct, double cost, double amount, String producer, double importCost, String provinceImport, double taxImport) {
        super(id, productCode, nameProduct, cost, amount, producer);
        this.importCost = importCost;
        this.provinceImport = provinceImport;
        this.taxImport = taxImport;
    }

    public ImportProduct() {

    }

    public double getImportCost() {
        return importCost;
    }

    public void setImportCost(double importCost) {
        this.importCost = importCost;
    }

    public String getProvinceImport() {
        return provinceImport;
    }

    public void setProvinceImport(String provinceImport) {
        this.provinceImport = provinceImport;
    }

    public double getTaxImport() {
        return taxImport;
    }

    public void setTaxImport(double taxImport) {
        this.taxImport = taxImport;
    }

    @Override
    public String toString() {
        return "ImportProduct{" +
                "importCost=" + importCost +
                ", provinceImport='" + provinceImport + '\'' +
                ", taxImport='" + taxImport + '\'' +
                "} " + super.toString();
    }
}
