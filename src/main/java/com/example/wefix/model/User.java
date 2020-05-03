package com.example.wefix.model;
//Shashank Pandey
//22/04/2020

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    private int id;
    private String name;
    private String emailId;
    @Id
    private String contactNo;
    private String password;
}
