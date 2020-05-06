package com.egorl.car_service.service;

import com.haulmont.cuba.security.entity.User;

public interface ManagerService {
    String NAME = "carservice_ManagerService";

    Long getPurchaseRequestsCount(User user);
}