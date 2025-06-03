package com.API_CRUD.JavaLevel1Exam.supplier;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {
    private final SupplierService SupplierService;


    public SupplierController(SupplierService SupplierService) {
        this.SupplierService = SupplierService;
    }

    @PostMapping("/suppliers")
    public SupplierDto save(
            @RequestBody SupplierDto dto
    ){
        return SupplierService.saveSupplier(dto);
    }

    @GetMapping("/suppliers")
    public List<SupplierDto> getAll(){
        return SupplierService.getAllSuppliers();
    }

    @PutMapping("/suppliers/{id}")
    public SupplierDto updateById(
            @PathVariable Integer id,
            @RequestBody SupplierUpdateDto dto
    ){
        return SupplierService.updateSupplierById(id, dto);
    }

    @DeleteMapping("/suppliers/{id}")
    public void deleteSupplierById(
            @PathVariable Integer id
    ){
        SupplierService.deleteSupplierById(id);
    }
}
