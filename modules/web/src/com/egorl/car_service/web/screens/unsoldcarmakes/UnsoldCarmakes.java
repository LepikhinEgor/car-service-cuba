package com.egorl.car_service.web.screens.unsoldcarmakes;

import com.egorl.car_service.entity.CarMake;
import com.egorl.car_service.service.CarMakeService;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.List;

@UiController("carservice_UnsoldCarmakes")
@UiDescriptor("unsold-carmakes.xml")
@LoadDataBeforeShow
public class UnsoldCarmakes extends Screen {

    @Inject
    Table<CarMake> carMakesTable;

    @Inject
    private CollectionLoader<CarMake> carmakesDl;

    private CarMakeService carMakeService;

    @Inject
    public void setCarMakeService(CarMakeService carMakeService) {
        this.carMakeService = carMakeService;
    }

    @Install(to="carmakesDl", target = Target.DATA_LOADER)
    protected List<CarMake> getUnsoldCarMakes(LoadContext<CarMake> loadContext) {
        return carMakeService.getUnpaidCarMakes(loadContext.getView());
    }
}