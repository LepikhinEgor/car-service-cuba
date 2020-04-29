package com.egorl.car_service.dao;

import com.egorl.car_service.entity.Country;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service(CountryDaoService.NAME)
public class CountryDaoServiceBean implements CountryDaoService {

//    private Persistence persistence;
//
//    @Inject
//    public void setPersistence(Persistence persistence) {
//        this.persistence = persistence;
//    }

    @Transactional
    public void create(Country country) {
//        EntityManager entityManager = persistence.getEntityManager();
//
//        entityManager.persist(country);
    }
}