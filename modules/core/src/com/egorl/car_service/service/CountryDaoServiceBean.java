package com.egorl.car_service.service;

import com.egorl.car_service.entity.Country;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.TypedQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.persistence.NoResultException;

@Service(CountryDaoService.NAME)
public class CountryDaoServiceBean implements CountryDaoService {

    @Inject
    private Persistence persistence;

//    @Inject
//    public void setPersistence(Persistence persistence) {
//        this.persistence = persistence;
//    }

    @Transactional
    public void create(Country country) {
        EntityManager entityManager = persistence.getEntityManager();

        entityManager.persist(country);
    }

    @Transactional
    public Country findByName(String name) {
        EntityManager entityManager = persistence.getEntityManager();

        TypedQuery<Country> query = entityManager.createQuery("select c from carservice_Country c where c.name = :name", Country.class);
        query.setParameter("name", name);

        try {
            Country country = query.getSingleResult();
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }
}