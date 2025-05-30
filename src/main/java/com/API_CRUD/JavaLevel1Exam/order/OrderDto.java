package com.API_CRUD.JavaLevel1Exam.order;

import com.API_CRUD.JavaLevel1Exam.product.Product;

import java.util.List;

public record OrderDto(
        Integer clientId,
        List<Product>products
) {
}
