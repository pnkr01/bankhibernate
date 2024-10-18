package com.fil.saving;

import com.fil.common.Account;
import com.fil.common.EntityManagerFactoryProvider;
import com.fil.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PrimaryKeyJoinColumn;
import java.sql.Date;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "accno")
public class SavingAccount extends Account {

    private String debitCard;

    public SavingAccount(int accno, Double balance, String ifsc, Date openDate, String name, Customer customer, String debitCard) {
        super(accno,balance,ifsc,openDate,customer);
        this.debitCard = debitCard;
    }

    public SavingAccount() {

    }

    public static void main(String[] args) {
        Customer customer = new Customer(0,"CustomerName","Near Iffco chowk","52525252","2506","6299261625","M");
        SavingAccount sa = new SavingAccount(0,12.3,"ifsc",Date.valueOf("2024-10-18"),"Pawan Kumar",customer,"debitcard");
        EntityManager entityManager = EntityManagerFactoryProvider.getEntityManagerFactory();
        entityManager.getTransaction().begin();
        entityManager.persist(sa);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
