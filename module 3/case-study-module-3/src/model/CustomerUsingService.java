package model;

public class CustomerUsingService {
    private int customerId;
    private String customerName;
    private int serviceId;
    private String serviceName;
    private int contractId;
    private  String attach_service_name;

    public CustomerUsingService(int customerId, String customerName, int serviceId, String serviceName, int contractId, String attach_service_name) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.contractId = contractId;
        this.attach_service_name = attach_service_name;
    }

    public CustomerUsingService() {

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public void setAttach_service_name(String attach_service_name) {
        this.attach_service_name = attach_service_name;
    }
}
