package com.API_CRUD.JavaLevel1Exam.Purchase;


import com.API_CRUD.JavaLevel1Exam.Client.Client;
import com.API_CRUD.JavaLevel1Exam.Order.Order;
import com.API_CRUD.JavaLevel1Exam.Supplier.Supplier;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Order order;
    private Supplier supplier;
    private Client client;

    public Purchase() {
    }

    public Purchase(Integer id, Client client, Supplier supplier, Order order) {
        this.id = id;
        this.client = client;
        this.supplier = supplier;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
}
