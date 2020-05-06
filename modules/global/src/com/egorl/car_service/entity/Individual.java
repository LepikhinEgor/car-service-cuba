package com.egorl.car_service.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

//@NamePattern("%s %s|name, surname")
@DiscriminatorValue("INDIVIDUAL")
@Entity(name = "carservice_Individual")
public class Individual extends Person {
    private static final long serialVersionUID = -578139825523532705L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "individual")
    private List<PurchaseRequest> purchaseRequests;

    @Transient
    private Integer purchaseRequestsCount;

    public Integer getPurchaseRequestsCount() {
        return purchaseRequests.size();
    }

    public List<PurchaseRequest> getPurchaseRequests() {
        return purchaseRequests;
    }

    public void setPurchaseRequests(List<PurchaseRequest> purchaseRequests) {
        this.purchaseRequests = purchaseRequests;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}