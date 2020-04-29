package com.egorl.car_service.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Country;

@UiController("carservice_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {
}