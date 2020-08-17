package com.bgagnon.agent;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Agent {
    @Id
    private String code;
    private String name;
    private String workingArea;
    private Float commission;
    private String phone;
    private String country;

    public Agent() {

    }
}
