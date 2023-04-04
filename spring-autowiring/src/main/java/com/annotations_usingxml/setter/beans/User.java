package com.annotations_usingxml.setter.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;


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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", address=" + address +
                '}';
    }
}
