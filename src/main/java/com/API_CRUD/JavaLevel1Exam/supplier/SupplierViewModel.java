package com.API_CRUD.JavaLevel1Exam.supplier;

import com.API_CRUD.JavaLevel1Exam.product.ProductDto;

import java.util.List;

public record SupplierViewModel(
        String name,
        List<ProductDto> products
) {
}
