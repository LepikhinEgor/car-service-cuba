package com.egorl.car_service.web.screens.legalentity;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.LegalEntity;

@UiController("carservice_LegalEntity.edit")
@UiDescriptor("legal-entity-edit.xml")
@EditedEntityContainer("legalEntityDc")
@LoadDataBeforeShow
public class LegalEntityEdit extends StandardEditor<LegalEntity> {
}