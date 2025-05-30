package com.API_CRUD.JavaLevel1Exam.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductDto saveProduct(ProductDto dto){
        var product = mapper.toProduct(dto);
        repository.save(product);
        return dto;
    }
    
    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public ProductDto getProductById(Integer id){
        return repository.findById(id)
                .map(mapper::toProductDto)
                .orElse(null);
    }

    public void deleteProductById(Integer id){
        repository.deleteById(id);
    }
}
