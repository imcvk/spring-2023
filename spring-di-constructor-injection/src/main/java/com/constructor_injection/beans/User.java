package com.constructor_injection.beans;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {
    int userid;
    String userName;
    Vehicle vehicle;
    List<String> city;
}
