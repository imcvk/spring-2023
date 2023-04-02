package com.constructor_injection.beans;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    int userid;
    String userName;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        System.out.println("Using setter injection for id");
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("Using setter injection for name");
        this.userName = userName;
    }
}
