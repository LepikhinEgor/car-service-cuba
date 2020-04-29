package com.egorl.car_service.config;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;

@Source(type = SourceType.APP)
public interface CountryConfig extends Config {

    @Property("default.country.name")
    String getDefaultCountryName();

    @Property("default.country.code")
    int getDefaultCountryCode();
}