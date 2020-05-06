package com.egorl.car_service.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@NamePattern("request %s|id")
@Table(name = "CARSERVICE_PURCHASE_REQUEST")
@Entity(name = "carservice_PurchaseRequest")
public class PurchaseRequest extends StandardEntity {
    private static final long serialVersionUID = 8913964474014226472L;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    private Car car;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUYER_ID")
    private Person buyer;
    @Column(name = "WAS_PAID")
    private Boolean wasPaid = false;
    @Column(name = "PRICE")
    private Integer price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANAGER_ID")
    private User manager;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INDIVIDUAL_ID")
    protected Individual individual;

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getWasPaid() {
        return wasPaid;
    }

    public void setWasPaid(Boolean wasPaid) {
        this.wasPaid = wasPaid;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}