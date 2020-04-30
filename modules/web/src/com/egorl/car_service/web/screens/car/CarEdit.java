package com.egorl.car_service.web.screens.car;

import com.egorl.car_service.entity.CarDealer;
import com.egorl.car_service.entity.CarEquipment;
import com.egorl.car_service.entity.CarMake;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.navigation.UrlParamsChangedEvent;
import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Car;

import javax.inject.Inject;

@UiController("carservice_Car.edit")
@UiDescriptor("car-edit.xml")
@EditedEntityContainer("carDc")
//@LoadDataBeforeShow
public class CarEdit extends StandardEditor<Car> {

    @Inject
    private CollectionLoader<CarMake> carMakesDl;

    @Inject
    private CollectionLoader<CarEquipment> carEquipsDl;

    @Inject
    private LookupPickerField<CarDealer> carDealersField;

    @Inject
    private LookupPickerField<CarMake> carMakesField;

    @Inject
    private LookupPickerField<CarEquipment> carEquipsField;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        carMakesDl.setParameter("carDealer", getEditedEntity().getCarDealer());
        carEquipsDl.setParameter("carMake", getEditedEntity().getCarMake());

        carDealersField.addValueChangeListener(dealerChangeEvent ->onCarDealerChange(dealerChangeEvent.getValue()));
        carMakesField.addValueChangeListener(makeChangeEvent ->onCarMakeChange(makeChangeEvent.getValue()));

        getScreenData().loadAll();
    }

    private void onCarDealerChange(CarDealer carDealer) {
        carMakesDl.setParameter("carDealer", carDealer);
        carMakesDl.load();

        carMakesField.clear();
        carEquipsField.clear();
    }

    private void onCarMakeChange(CarMake carMake) {
        carEquipsDl.setParameter("carMake", carMake);
        carEquipsDl.load();

        carEquipsField.clear();
    }

}