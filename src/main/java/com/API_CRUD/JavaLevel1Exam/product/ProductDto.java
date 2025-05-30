package com.API_CRUD.JavaLevel1Exam.product;

import java.math.BigDecimal;

public record ProductDto(
        Integer categoryId,
        String name,
        BigDecimal price,
        int quantity,
        Integer supplierId
) {
}
