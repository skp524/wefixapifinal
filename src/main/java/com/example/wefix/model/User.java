package com.example.wefix.model;
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
    @GeneratedValue
    @Id
    private int id;
    private String name;
    private String emailId;
    private String contactNo;
    private String password;
}
