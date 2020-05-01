package com.egorl.car_service.web.screens.purchaserequest;

import com.haulmont.cuba.gui.screen.*;
import com.egorl.car_service.entity.PurchaseRequest;

@UiController("carservice_PurchaseRequest.browse")
@UiDescriptor("purchase-request-browse.xml")
@LookupComponent("purchaseRequestsTable")
@LoadDataBeforeShow
public class PurchaseRequestBrowse extends StandardLookup<PurchaseRequest> {
}