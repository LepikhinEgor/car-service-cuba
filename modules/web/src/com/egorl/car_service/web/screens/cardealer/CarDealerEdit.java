package com.egorl.car_service.web.screens.cardealer;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.CarDealer;

@UiController("carservice_CarDealer.edit")
@UiDescriptor("car-dealer-edit.xml")
@EditedEntityContainer("carDealerDc")
@LoadDataBeforeShow
public class CarDealerEdit extends StandardEditor<CarDealer> {
}