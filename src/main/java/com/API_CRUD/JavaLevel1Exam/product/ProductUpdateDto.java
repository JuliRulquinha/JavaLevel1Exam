package com.API_CRUD.JavaLevel1Exam.product;

import java.math.BigDecimal;

public record ProductUpdateDto(
        String name,
        BigDecimal price,
        int quantity
) {
}
