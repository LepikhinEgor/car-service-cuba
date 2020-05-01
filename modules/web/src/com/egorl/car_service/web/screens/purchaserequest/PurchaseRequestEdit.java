package com.egorl.car_service.web.screens.purchaserequest;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.PurchaseRequest;

@UiController("carservice_PurchaseRequest.edit")
@UiDescriptor("purchase-request-edit.xml")
@EditedEntityContainer("purchaseRequestDc")
@LoadDataBeforeShow
public class PurchaseRequestEdit extends StandardEditor<PurchaseRequest> {
}