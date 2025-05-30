package com.API_CRUD.JavaLevel1Exam.Purchase;

public record PurchaseDto(
        Integer orderId,
        Integer supplierId,
        Integer clientId
) {
}
