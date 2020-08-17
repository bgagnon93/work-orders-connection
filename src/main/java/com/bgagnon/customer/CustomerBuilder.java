package com.bgagnon.customer;

public class CustomerBuilder {

    private Customer customer;

    public CustomerBuilder() {
        this.customer = new Customer();
    }

    public CustomerBuilder code(String code) {
        customer.setCode(code);
        return this;
    }

    public CustomerBuilder name(String name) {
        customer.setCode(name);
        return this;
    }

    public CustomerBuilder city(String city) {
        customer.setCode(city);
        return this;
    }

    public CustomerBuilder workingArea(String workingArea) {
        customer.setCode(workingArea);
        return this;
    }

    public CustomerBuilder openingAMT(Float openingAMT) {
        customer.setOpeningAMT(openingAMT);
        return this;
    }

    public CustomerBuilder receiveAMT(Float receiveAMT) {
        customer.setReceiveAMT(receiveAMT);
        return this;
    }

    public CustomerBuilder paymentAMT(Float paymentAMT) {
        customer.setPaymentAMT(paymentAMT);
        return this;
    }

    public CustomerBuilder outstandingAMT(Float outstandingAMT) {
        customer.setOutstandingAMT(outstandingAMT);
        return this;
    }

    public CustomerBuilder phone(String phone) {
        customer.setPhone(phone);
        return this;
    }

    public CustomerBuilder agentCode(String agentCode) {
        customer.setAgentCode(agentCode);
        return this;
    }
}
