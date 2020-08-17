package com.bgagnon.order;

import java.sql.Date;

public class OrderBuilder {

    private Orders order;

    public OrderBuilder() {
        this.order = new Orders();
    }

    public OrderBuilder number(Float number) {
        order.setNumber(number);
        return this;
    }

    public OrderBuilder amount(Float amount) {
        order.setAmount(amount);
        return this;
    }

    public OrderBuilder advanceAmount(Float advanceAmount) {
        order.setAdvanceAmount(advanceAmount);
        return this;
    }

    public OrderBuilder date(Date date) {
        order.setDate(date);
        return this;
    }

    public OrderBuilder customerCode(String customerCode) {
        order.setCustomerCode(customerCode);
        return this;
    }

    public OrderBuilder agentCode(String agentCode) {
        order.setAgentCode(agentCode);
        return this;
    }

    public OrderBuilder description(String description) {
        order.setDescription(description);
        return this;
    }

}
