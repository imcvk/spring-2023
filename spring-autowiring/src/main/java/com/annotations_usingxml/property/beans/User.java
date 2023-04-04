package com.annotations_usingxml.property.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;


@ToString
@Getter
@Setter
public class User {
    int userid;
    String userName;
    @Autowired
    Address address;

    public User() {
    }

    public User(int userid, String userName, Address address) {
        this.userid = userid;
        this.userName = userName;
        this.address = address;
    }
}
