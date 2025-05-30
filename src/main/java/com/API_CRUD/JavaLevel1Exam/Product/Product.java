package com.API_CRUD.JavaLevel1Exam.Product;

import com.API_CRUD.JavaLevel1Exam.Category.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer categoryId;
    private String name;
    private BigDecimal price;
    private int quantity;
}
