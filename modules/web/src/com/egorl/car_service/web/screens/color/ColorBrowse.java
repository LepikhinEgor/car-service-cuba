package com.egorl.car_service.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.Color;

@UiController("carservice_Color.browse")
@UiDescriptor("color-browse.xml")
@LookupComponent("colorsTable")
@LoadDataBeforeShow
public class ColorBrowse extends StandardLookup<Color> {
}