package com.API_CRUD.JavaLevel1Exam.Order;

import com.API_CRUD.JavaLevel1Exam.Product.Product;

import java.util.List;

public record OrderDto(
        Integer clientId,
        List<Product>products
) {
}
