package com.egorl.car_service.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Country;

@UiController("carservice_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
@LoadDataBeforeShow
public class CountryEdit extends StandardEditor<Country> {
}