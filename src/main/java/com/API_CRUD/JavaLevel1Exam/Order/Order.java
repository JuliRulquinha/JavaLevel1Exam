package com.API_CRUD.JavaLevel1Exam.Order;

import com.API_CRUD.JavaLevel1Exam.Product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer clientId;
    private List<Product> products;
}
