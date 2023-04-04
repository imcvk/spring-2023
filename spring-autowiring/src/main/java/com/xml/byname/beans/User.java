package com.xml.byname.beans;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {
    int userid;
    String userName;
    Address address;
}
