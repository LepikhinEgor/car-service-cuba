package com.egorl.car_service.web.screens.car;

import com.egorl.car_service.entity.CarDealer;
import com.egorl.car_service.entity.CarEquipment;
import com.egorl.car_service.entity.CarMake;
import com.haulmont.cuba.core.global.BeanLocator;
import com.haulmont.cuba.gui.actions.list.CreateAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.ValidationException;
import com.haulmont.cuba.gui.components.validation.NotBlankValidator;
import com.haulmont.cuba.gui.components.validation.NotEmptyValidator;
import com.haulmont.cuba.gui.components.validation.NotNullValidator;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.navigation.UrlParamsChangedEvent;
import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Car;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Calendar;
import java.util.Date;

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

    @Inject
    private TextField<Integer> costField;

    @Inject
    private TextField<Integer> yearOfIssueField;

    @Inject
    private BeanLocator beanLocator;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        carMakesDl.setParameter("carDealer", getEditedEntity().getCarDealer());
        carEquipsDl.setParameter("carMake", getEditedEntity().getCarMake());

        carDealersField.addValueChangeListener(dealerChangeEvent ->onCarDealerChange(dealerChangeEvent.getValue()));
        carMakesField.addValueChangeListener(makeChangeEvent ->onCarMakeChange(makeChangeEvent.getValue()));

        addValidators();

        if (yearOfIssueField.getValue() == null)
            yearOfIssueField.setValue(Calendar.getInstance().get(Calendar.YEAR));

        getScreenData().loadAll();
    }


    private void addValidators() {
        carDealersField.addValidator(beanLocator.getPrototype(NotNullValidator.NAME));
        carMakesField.addValidator(beanLocator.getPrototype(NotNullValidator.NAME));
        carEquipsField.addValidator(beanLocator.getPrototype(NotNullValidator.NAME));
        yearOfIssueField.addValidator(beanLocator.getPrototype(NotNullValidator.NAME));
        costField.addValidator(beanLocator.getPrototype(NotNullValidator.NAME));

        costField.addValidator(costValue -> {
            CarEquipment curEquip = carEquipsField.getValue();
            if (curEquip == null)
                return;
            if (costValue < curEquip.getPrice())
                throw new ValidationException(
                        String.format("Car cost(%d) must be more than equipment price %d",costValue, curEquip.getPrice()));
        });
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