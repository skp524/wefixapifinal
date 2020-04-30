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
public class OrderHSRequest {

    @GeneratedValue
    @Id
    private int orderIdHS;
    private  String contactNO;
    private  String serviceType;
    private String serviceSubType;
    private String problems;
    private String workDescription;
    private String startDate;
    private String endDate;
    private String city;
    private String address;
}
