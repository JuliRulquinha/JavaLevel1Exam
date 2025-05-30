package com.API_CRUD.JavaLevel1Exam.Supplier;

import com.API_CRUD.JavaLevel1Exam.Product.Product;
import com.API_CRUD.JavaLevel1Exam.Sale.Sale;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private List<Product> products;
    private List<Sale> sales;

}
