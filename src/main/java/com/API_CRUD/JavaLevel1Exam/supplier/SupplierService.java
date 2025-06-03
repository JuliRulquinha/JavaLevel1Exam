package com.API_CRUD.JavaLevel1Exam.supplier;

import com.API_CRUD.JavaLevel1Exam.supplier.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    private final SupplierRepository repository;
    private final SupplierMapper mapper;

    public SupplierService(SupplierRepository repository, SupplierMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public SupplierDto saveSupplier(SupplierDto dto){
        var supplier = mapper.toSupplier(dto);
        repository.save(supplier);
        return dto;
    }

    public List<SupplierDto> getAllSuppliers(){

        var SupplierList = repository.findAll();
        return mapper.toSupplierDtoList(SupplierList);
    }

    public SupplierViewModel getSupplierById(Integer id){
        return repository.findById(id)
                .map(mapper::toSupplierViewModel)
                .orElse(null);
    }

    public SupplierDto updateSupplierById(Integer id, SupplierUpdateDto updateDto){
        var supplier = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Supplier not found with id: " + id));

        supplier.setName(updateDto.name());
        supplier.setEmail(updateDto.email());

        var updatedSupplier = repository.save(supplier);
        return mapper.toSupplierDto(updatedSupplier);
    }

    public void deleteSupplierById(Integer id){
        repository.deleteById(id);
    }
}
