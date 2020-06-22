class Customer {
    constructor(name, cmnd, birthday, email, address, typeService, typeRoom, typeCustomer, quantityIncluded, renDays) {
        this.name = name;
        this.cmnd = cmnd;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.typeService = typeService;
        this.typeRoom = typeRoom;
        this.typeCustomer = typeCustomer;
        this.quantityIncluded = quantityIncluded;
        this.renDays = renDays;
    }
    setName (name) {
        this.name = name;
    }
    getName () {
        return this.name;
    }
    setCMND (cmnd) {
        this.cmnd = cmnd;
    }
    getCMND () {
        return this.cmnd;
    }
    setBirthday (birthday) {
        this.birthday = birthday;
    }
    getBirthday () {
        return this.birthday;
    }
    setEmail (email) {
        this.email = email;
    }
    getEmail () {
        return this.email;
    }
    setAddress (address) {
        this.address = address;
    }
    getAddress () {
        return this.address;
    }
    setTypeService (typeService) {
        this.typeService = typeService;
    }
    getTypeService () {
        return this.typeService;
    }
    setTypeRoom (typeRoom) {
        this.typeRoom = typeRoom;
    }
    getTypeRoom () {
        return this.typeRoom;
    }
    setTypeCustomer (typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
    getTypeCustomer () {
        return this.typeCustomer;
    }
    setDiscount (discount) {
        this.discount = discount;
    }
    getDiscount () {
        return this.discount;
    }
    setQuantityIncluded (quantityIncluded) {
        this.quantityIncluded = quantityIncluded;
    }
    getQuantityIncluded () {
        return this.name;
    }
    setRenDays (renDays) {
        this.renDays = renDays;
    }
    getRenDays () {
        return this.renDays;
    }
    totalPay () {
        let money = 0;
        if(this.getTypeService() == "Villa"){
            money = 500;
        }else if(this.getTypeService() == "House"){
            money = 300;
        }else if (this.getTypeService() == "Room"){
            money = 200;
        }
        return this.getRenDays()*money*(1 - this.getDiscount()/100);
    }
}