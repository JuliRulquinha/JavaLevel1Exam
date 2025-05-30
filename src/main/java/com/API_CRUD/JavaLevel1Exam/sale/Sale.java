package com.API_CRUD.JavaLevel1Exam.sale;

import com.API_CRUD.JavaLevel1Exam.client.Client;
import com.API_CRUD.JavaLevel1Exam.purchase.Purchase;
import com.API_CRUD.JavaLevel1Exam.supplier.Supplier;
import jakarta.persistence.*;

@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(
            name = "client_id"
    )
    private Client client;

    @OneToOne
    @JoinColumn(
            name = "supplier_id"
    )
    private Supplier supplier;


    public Sale() {
    }

    public Sale(Integer id, Supplier supplier, Client client) {
        this.id = id;

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


}
