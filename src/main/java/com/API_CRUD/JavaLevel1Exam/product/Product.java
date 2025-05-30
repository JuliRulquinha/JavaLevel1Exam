package com.API_CRUD.JavaLevel1Exam.product;

import com.API_CRUD.JavaLevel1Exam.category.Category;
import com.API_CRUD.JavaLevel1Exam.supplier.Supplier;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @Column(name = "balance")
    private BigDecimal price;
    private int quantity;

    @ManyToOne()
    @JoinColumn(
            name = "category_id"
    )
    @JsonBackReference
    private Category category;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @ManyToOne()
    @JoinColumn(
            name = "supplier_id"
    )
    @JsonBackReference
    private Supplier supplier;

    public Product() {
    }

    public Product(Integer id, Category category, int quantity, BigDecimal price, String name, Supplier supplier) {
        this.id = id;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.supplier = supplier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
