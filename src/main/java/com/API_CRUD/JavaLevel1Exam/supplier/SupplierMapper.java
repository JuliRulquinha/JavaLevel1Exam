package com.API_CRUD.JavaLevel1Exam.supplier;

import org.springframework.stereotype.Service;
import com.API_CRUD.JavaLevel1Exam.product.ProductMapper;
import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierMapper {

    private ProductMapper productMapper;



    public Supplier toSupplier(SupplierDto dto){
        var supplier = new Supplier();
        supplier.setEmail(dto.email());
        supplier.setName(dto.name());
        return supplier;
    }

    public SupplierDto toSupplierDto(Supplier supplier){ return new SupplierDto(supplier.getName(), supplier.getEmail());}

    public SupplierViewModel toSupplierViewModel(Supplier supplier){
        return new SupplierViewModel(supplier.getName(), productMapper.toProductDtoList(supplier.getProducts()));
    }

    public List<SupplierDto> toSupplierDtoList(List<Supplier> categories){
        List<SupplierDto> SupplierList = new ArrayList<SupplierDto>();
        for(var Supplier : categories){
            SupplierList.add(new SupplierDto(Supplier.getName(), Supplier.getEmail()));
        }

        return SupplierList;
    }
}
