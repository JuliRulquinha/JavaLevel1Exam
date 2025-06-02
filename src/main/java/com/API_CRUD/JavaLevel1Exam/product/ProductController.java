package com.API_CRUD.JavaLevel1Exam.product;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public ProductDto save(
            @RequestBody ProductDto dto
    ){
        return productService.saveProduct(dto);
    }

    @GetMapping("/products")
    public List<ProductDto> getAll(){
        return productService.getAllProducts();
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(
            @PathVariable Integer id
    ){
        productService.deleteProductById(id);
    }
}
