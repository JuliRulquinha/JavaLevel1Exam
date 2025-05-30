package com.API_CRUD.JavaLevel1Exam.Sale;

import com.API_CRUD.JavaLevel1Exam.Client.Client;
import com.API_CRUD.JavaLevel1Exam.Purchase.Purchase;
import com.API_CRUD.JavaLevel1Exam.Supplier.Supplier;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Client client;
    private Supplier supplier;
    private Purchase purchase;

    public Sale() {
    }

    public Sale(Integer id, Purchase purchase, Supplier supplier, Client client) {
        this.id = id;
        this.purchase = purchase;
        this.supplier = supplier;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
