package vn.codegym.casestudyfurama.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Contract {
    @Id
    private String contractId;

    private String contractStartDate;
    private String contractEndDate;
    private String contractDeposit;
    private String contractTotalMoney;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "serviceId")
    private Service service;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL)
    private List<ContractDetail> contractDetails;

    public Contract() {
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(String contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public String getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(String contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
