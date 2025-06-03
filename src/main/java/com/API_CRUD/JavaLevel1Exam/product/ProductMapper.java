package com.API_CRUD.JavaLevel1Exam.product;

import com.API_CRUD.JavaLevel1Exam.category.Category;
import com.API_CRUD.JavaLevel1Exam.category.CategoryDto;
import com.API_CRUD.JavaLevel1Exam.supplier.Supplier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductMapper {
    public Product toProduct(ProductDto dto){
        var product = new Product();
        product.setName(dto.name());
        product.setPrice(dto.price());
        product.setQuantity(dto.quantity());

        var supplier = new Supplier();
        var category = new Category();

        category.setId(dto.categoryId());
        supplier.setId(dto.supplierId());

        product.setSupplier(supplier);
        product.setCategory(category);

        return product;
    }

    public ProductDto toProductDto(Product product){
        var category = product.getCategory();
        var supplier = product.getSupplier();

        return new ProductDto(category.getId(), product.getName(), product.getPrice(), product.getQuantity(), supplier.getId() );
    }

    public List<ProductDto> toProductDtoList(List<Product> products){
        List<ProductDto> productList = new ArrayList<ProductDto>();
        for(var product : products){
            var category = product.getCategory();
            var supplier = product.getSupplier();
            productList.add(new ProductDto(category.getId(), product.getName(), product.getPrice(), product.getQuantity(), supplier.getId()));
        }

        return productList;
    }

    public ProductUpdateDto toProductUpdateDto(Product product){
        return new ProductUpdateDto(product.getName(), product.getPrice(), product.getQuantity());
    }
}
