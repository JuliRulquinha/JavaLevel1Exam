package com.API_CRUD.JavaLevel1Exam.product;

import com.API_CRUD.JavaLevel1Exam.category.Category;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public Product toProduct(ProductDto dto){
        var product = new Product();
        product.setName(dto.name());
        product.setPrice(dto.price());
        product.setQuantity(dto.quantity());
        var category = new Category();
        category.setId(dto.categoryId());

        product.setCategory(category);

        return product;
    }

    public ProductDto toProductDto(Product product){
        var category = product.getCategory();
        var supplier = product.getSupplier();

        return new ProductDto(category.getId(), product.getName(), product.getPrice(), product.getQuantity(), supplier.getId() );
    }
}
