package com.egorl.car_service.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Color;

@UiController("carservice_Color.edit")
@UiDescriptor("color-edit.xml")
@EditedEntityContainer("colorDc")
@LoadDataBeforeShow
public class ColorEdit extends StandardEditor<Color> {
}