package com.egorl.car_service.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum CarType implements EnumClass<Integer> {

    CROSSOVER(0),
    UNIVERSAL(1),
    SEDAN(2);

    private Integer id;

    CarType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static CarType fromId(Integer id) {
        for (CarType at : CarType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}