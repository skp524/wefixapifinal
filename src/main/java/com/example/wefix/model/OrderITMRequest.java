package com.example.wefix.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class OrderITMRequest {
    @GeneratedValue
    @Id
    private int orderIdITM;
    private  String contactNo;
    private  String serviceType;
    private int laptop;
    private int desktop;
    private int printer;
    private int server;
    private int cartridge;
    private int software;
    private String workDescription;
    private String startDate;
    private String endDate;
    private String city;
    private String address;

}