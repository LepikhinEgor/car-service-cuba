package com.egorl.car_service.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Car;

@UiController("carservice_Car.browse")
@UiDescriptor("car-browse.xml")
@LookupComponent("carsTable")
@LoadDataBeforeShow
public class CarBrowse extends StandardLookup<Car> {
}