package com.propertymanagement.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter

@Table(name = "Property_Table")
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @Column(name = "Property_Title", nullable = false,length = 255)
    private String title;
//    @Column(name = "Description",nullable = true)
    private String description;
//    @Column(name = "Owner_Name",nullable = false)
    private String ownerName;
//    @Column(name = "Owner_Mail",nullable = false)
    private String ownerMail;
//    @Column(name = "Price",nullable = false)
    private Double price;
//    @Column(name = "Address",nullable = false)
    private String address;
}
