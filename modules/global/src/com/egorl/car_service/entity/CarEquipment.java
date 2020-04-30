package com.egorl.car_service.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "CARSERVICE_CAR_EQUIPMENT")
@Entity(name = "carservice_CarEquipment")
public class CarEquipment extends StandardEntity {
    private static final long serialVersionUID = -2804669971804055849L;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PRICE", nullable = false)
    private Integer price;

    @Column(name = "CAR_TYPE", nullable = false)
    private Integer carType;

    @Column(name = "NOTE", nullable = false)
    private String note;

    @ManyToOne
    @JoinColumn(name = "CAR_MAKE_ID")
    private CarMake carMake;

    public CarType getCarType() {
        return carType == null ? null : CarType.fromId(carType);
    }

    public void setCarType(CarType carType) {
        this.carType = carType == null ? null : carType.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CarMake getCarMake() {
        return carMake;
    }

    public void setCarMake(CarMake carMake) {
        this.carMake = carMake;
    }
}