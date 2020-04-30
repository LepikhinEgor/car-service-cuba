package com.egorl.car_service.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "CARSERVICE_CAR")
@Entity(name = "carservice_Car")
public class Car extends StandardEntity {
    private static final long serialVersionUID = 4938562890715916885L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_DEALER_ID")
    private CarDealer carDealer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_MAKE_ID")

    private CarMake carMake;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EQUIPMENT_ID")
    private CarEquipment equipment;

    @Column(name = "YEAR_OF_ISSUE")
    private Integer yearOfIssue;

    @Column(name = "COST")
    private Integer cost;

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public CarMake getCarMake() {
        return carMake;
    }

    public void setCarMake(CarMake carMake) {
        this.carMake = carMake;
    }

    public CarEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(CarEquipment equipment) {
        this.equipment = equipment;
    }

    public CarDealer getCarDealer() {
        return carDealer;
    }

    public void setCarDealer(CarDealer carDealer) {
        this.carDealer = carDealer;
    }
}