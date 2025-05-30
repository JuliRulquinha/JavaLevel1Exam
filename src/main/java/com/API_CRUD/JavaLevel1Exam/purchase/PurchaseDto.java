package com.API_CRUD.JavaLevel1Exam.purchase;

public record PurchaseDto(
        Integer orderId,
        Integer supplierId,
        Integer clientId
) {
}
