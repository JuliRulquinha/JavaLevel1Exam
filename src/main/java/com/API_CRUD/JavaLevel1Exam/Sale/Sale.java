package com.API_CRUD.JavaLevel1Exam.Sale;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer clientId;
    private Integer supplierId;
    private Integer purchaseId;
}
