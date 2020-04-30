package com.egorl.car_service.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "CARSERVICE_COLOR")
@Entity(name = "carservice_Color")
public class Color extends StandardEntity {
    private static final long serialVersionUID = 3300920434161393311L;

    @Column(name = "NAME", unique = true, nullable = false)
    private String name;

    @Column(name = "COLOR_CODE", unique = true,  nullable = false)
    private String colorCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}