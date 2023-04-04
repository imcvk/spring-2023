package com.xml.byConstructor.beans;

import lombok.*;



@ToString
@Getter
@Setter
public class User {
    int userid;
    String userName;
    Address address;

    public User() {
    }

    public User(int userid, String userName, Address address) {
        this.userid = userid;
        this.userName = userName;
        this.address = address;
    }
}
