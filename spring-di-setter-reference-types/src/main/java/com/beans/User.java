package com.beans;

import lombok.*;

@Getter
@Setter@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    String userId;
    String userName;
    Vehicle vehicle;
}
