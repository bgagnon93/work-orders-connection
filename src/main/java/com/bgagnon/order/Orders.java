package com.bgagnon.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Orders {
    @Id
    @GeneratedValue
    private float number;
    private float amount;
    private float advanceAmount;
    private Date date;
    private String customerCode;
    private String agentCode;
    private String description;
}
