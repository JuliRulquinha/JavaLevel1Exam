package com.API_CRUD.JavaLevel1Exam.supplier;

import com.API_CRUD.JavaLevel1Exam.product.Product;
import com.API_CRUD.JavaLevel1Exam.sale.Sale;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String email;

    @OneToMany(
            mappedBy = "supplier"
    )
    @JsonManagedReference
    private List<Product> products;


    public Supplier() {
    }

    public Supplier(Integer id, List<Sale> sales, List<Product> products, String email, String name) {
        this.id = id;
        this.products = products;
        this.email = email;
        this.name = name;
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
