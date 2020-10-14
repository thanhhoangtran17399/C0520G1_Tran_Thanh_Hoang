package vn.codegym.casestudyfurama.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Service {
    @Id
    private String serviceId;

    private String serviceName;
    private String serviceArena;
    private String serviceCost;
    private String serviceMaxPeople;
    private String standardRoom;
    private String descreptionOtherConvenience;
    private String poolAra;
    private String numerOfFloors;

    @ManyToOne
    @JoinColumn(name = "rentTypeId")
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "serviceTypeId")
    private ServiceType serviceType;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<Contract> contracts;

    public Service() {
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceArena() {
        return serviceArena;
    }

    public void setServiceArena(String serviceArena) {
        this.serviceArena = serviceArena;
    }

    public String getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(String serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(String serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescreptionOtherConvenience() {
        return descreptionOtherConvenience;
    }

    public void setDescreptionOtherConvenience(String descreptionOtherConvenience) {
        this.descreptionOtherConvenience = descreptionOtherConvenience;
    }

    public String getPoolAra() {
        return poolAra;
    }

    public void setPoolAra(String poolAra) {
        this.poolAra = poolAra;
    }

    public String getNumerOfFloors() {
        return numerOfFloors;
    }

    public void setNumerOfFloors(String numerOfFloors) {
        this.numerOfFloors = numerOfFloors;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}

