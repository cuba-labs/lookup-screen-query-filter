package com.company.sample.web.customer;

import com.company.sample.entity.Customer;
import com.haulmont.bali.util.ParamsMap;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.GroupTable;

import javax.inject.Inject;

public class CustomerBrowse extends AbstractLookup {
    @Inject
    private GroupTable<Customer> customersTable;

    public void showOrders() {
        openLookup("sample$Order.browse", null, WindowManager.OpenType.DIALOG,
                ParamsMap.of("customer", customersTable.getSingleSelected()));
    }
}