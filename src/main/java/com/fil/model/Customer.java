package com.fil.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class Customer {
    @SequenceGenerator(name = "custidseq",initialValue = 101,allocationSize = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "custidseq")
     private int id;
     private String name;
     private String address;
     private String mobile;
     private String aadhar;
    private String phone;
    private String gender;

    public Customer() {
    }

    public Customer(int id, String name, String address, String mobile, String aadhar, String phone, String gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.aadhar = aadhar;
        this.phone = phone;
        this.gender = gender;
    }
}
