package com.egorl.car_service.web.screens.cardealer;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.CarDealer;

@UiController("carservice_CarDealer.browse")
@UiDescriptor("car-dealer-browse.xml")
@LookupComponent("carDealersTable")
@LoadDataBeforeShow
public class CarDealerBrowse extends StandardLookup<CarDealer> {
}