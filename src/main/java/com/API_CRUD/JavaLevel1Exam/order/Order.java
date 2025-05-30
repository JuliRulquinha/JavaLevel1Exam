package com.API_CRUD.JavaLevel1Exam.order;

import com.API_CRUD.JavaLevel1Exam.client.Client;
import com.API_CRUD.JavaLevel1Exam.product.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToMany
    private List<Product> products;


    public Order() {
    }

    public Order( List<Product> products, Integer id) {

        this.products = products;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
