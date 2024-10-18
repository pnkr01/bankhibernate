package com.fil.common;

import com.fil.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//will get the value of id from db
    //inbuilt methods mysql auto_inc.

    private int accno;
    private Double balance;
    private String ifsc;
    private Date openDate;
    //foreign key in acc with name customer_custid
    @ManyToOne
    @JoinColumn(name = "custid",nullable = false) //not customer_custid -> custid
    private Customer customer;
}
