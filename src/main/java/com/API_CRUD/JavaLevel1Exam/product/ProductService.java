package com.API_CRUD.JavaLevel1Exam.product;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import javax.sound.sampled.Port;
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
    
    public List<ProductDto> getAllProducts(){

        var productsFromDb = repository.findAll();
        return mapper.toProductDtoList(productsFromDb);
    }

    public ProductDto getProductById(Integer id){
        return repository.findById(id)
                .map(mapper::toProductDto)
                .orElse(null);
    }

    public ProductUpdateDto updateProductById(Integer id, ProductUpdateDto updateDto){
        var productFromDb = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + id));
        productFromDb.setPrice(updateDto.price());
        productFromDb.setQuantity(updateDto.quantity());
        productFromDb.setName(updateDto.name());

        var updatedProduct = repository.save(productFromDb);
        return mapper.toProductUpdateDto(updatedProduct);
    }

    public void deleteProductById(Integer id){
        repository.deleteById(id);
    }
}
