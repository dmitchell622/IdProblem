package com.company.idproblem.view.orderlineitem;

import com.company.idproblem.entity.OrderLineItem;

import com.company.idproblem.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "orderLineItems/:id", layout = MainView.class)
@ViewController("OrderLineItem.detail")
@ViewDescriptor("order-line-item-detail-view.xml")
@EditedEntityContainer("orderLineItemDc")
public class OrderLineItemDetailView extends StandardDetailView<OrderLineItem> {
}