package com.API_CRUD.JavaLevel1Exam.client;

import com.API_CRUD.JavaLevel1Exam.order.Order;
import com.API_CRUD.JavaLevel1Exam.purchase.Purchase;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String email;



    @OneToMany(
            mappedBy = "client"
    )
    @JsonManagedReference
    private List<Purchase> purchases;

    public Client() {
    }

    public Client(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
