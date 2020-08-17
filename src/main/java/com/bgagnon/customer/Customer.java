package com.bgagnon.customer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private String code;
    private String name;
    private String city;
    private String workingArea;
    private float grade;
    private float openingAMT;
    private float receiveAMT;
    private float paymentAMT;
    private float outstandingAMT;
    private String phone;
    private String agentCode;
}
