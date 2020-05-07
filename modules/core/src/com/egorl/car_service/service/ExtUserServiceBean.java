package com.egorl.car_service.service;

import com.egorl.car_service.entity.ExtUser;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.UUID;

@Service(ExtUserService.NAME)
public class ExtUserServiceBean implements ExtUserService {

    @Inject
    private Persistence persistence;

    @Override
    @Transactional
    public ExtUser getById(UUID uuid) {
        EntityManager entityManager = persistence.getEntityManager();

        return entityManager.find(ExtUser.class, uuid);
    }
}