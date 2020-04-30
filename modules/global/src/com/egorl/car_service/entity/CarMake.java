package com.egorl.car_service.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "CARSERVICE_CAR_MAKE")
@Entity(name = "carservice_CarMake")
public class CarMake extends StandardEntity {
    private static final long serialVersionUID = 4133730760085877282L;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_DEALER_ID")
    private CarDealer carDealer;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "carMake")
    private List<CarEquipment> equipments;

    public List<CarEquipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<CarEquipment> equipments) {
        this.equipments = equipments;
    }

    public CarDealer getCarDealer() {
        return carDealer;
    }

    public void setCarDealer(CarDealer carDealer) {
        this.carDealer = carDealer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}