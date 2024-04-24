package com.company.idproblem.view.orderlineitem;

import com.company.idproblem.entity.OrderLineItem;

import com.company.idproblem.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "orderLineItems", layout = MainView.class)
@ViewController("OrderLineItem.list")
@ViewDescriptor("order-line-item-list-view.xml")
@LookupComponent("orderLineItemsDataGrid")
@DialogMode(width = "64em")
public class OrderLineItemListView extends StandardListView<OrderLineItem> {
}