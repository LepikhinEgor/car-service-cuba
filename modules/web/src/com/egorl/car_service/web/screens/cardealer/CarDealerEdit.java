package com.egorl.car_service.web.screens.cardealer;

import com.egorl.car_service.entity.Country;
import com.egorl.car_service.service.CountryService;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.CarDealer;

import javax.inject.Inject;

@UiController("carservice_CarDealer.edit")
@UiDescriptor("car-dealer-edit.xml")
@EditedEntityContainer("carDealerDc")
@LoadDataBeforeShow
public class CarDealerEdit extends StandardEditor<CarDealer> {

    @Inject
    LookupPickerField<Country> countryField;

    private CountryService countryService;

    @Inject
    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if( getEditedEntity().getCountry() == null)
            countryField.setValue(countryService.getUserDefaultCountry());
    }
}