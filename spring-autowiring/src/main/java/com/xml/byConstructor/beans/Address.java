package com.xml.byConstructor.beans;

import lombok.*;


@Getter
@Setter
@ToString
public class Address {
    String city,state,country;

    public Address() {
    }

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
