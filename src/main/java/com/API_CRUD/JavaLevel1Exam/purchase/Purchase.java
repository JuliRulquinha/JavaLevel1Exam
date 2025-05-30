package com.API_CRUD.JavaLevel1Exam.purchase;


import com.API_CRUD.JavaLevel1Exam.client.Client;
import com.API_CRUD.JavaLevel1Exam.order.Order;
import com.API_CRUD.JavaLevel1Exam.supplier.Supplier;
import jakarta.persistence.*;

@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Order order;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;


    @ManyToOne
    @JoinColumn(
            name = "client_id"
    )
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
