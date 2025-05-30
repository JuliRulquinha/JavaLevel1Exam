package com.API_CRUD.JavaLevel1Exam.Order;

import com.API_CRUD.JavaLevel1Exam.Client.Client;
import com.API_CRUD.JavaLevel1Exam.Product.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private List<Product> products;

    @ManyToOne
    @JoinColumn(
            name = "client-id"
    )
    @JsonBackReference
    private Client client;

    public Order() {
    }

    public Order(Client client, List<Product> products, Integer id) {
        this.client = client;
        this.products = products;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
