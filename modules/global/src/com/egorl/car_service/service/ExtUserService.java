package com.egorl.car_service.service;

import com.egorl.car_service.entity.ExtUser;

import java.util.UUID;

public interface ExtUserService {
    String NAME = "carservice_ExtUserService";

    ExtUser getById(UUID uuid);
}