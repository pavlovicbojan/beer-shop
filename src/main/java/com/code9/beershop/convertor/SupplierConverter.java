package com.code9.beershop.convertor;

import com.code9.beershop.dto.SupplierDto;
import com.code9.beershop.model.Supplier;
import com.code9.beershop.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierConverter {

    @Autowired
    private BeerService beerService;

    @Autowired
    private BeerConverter beerConverter;

    public SupplierDto toDto(Supplier supplier) {
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setId(supplier.getId());
        supplierDto.setName(supplier.getName());
        supplierDto.setCountry(supplier.getCountry());
        supplierDto.setBeers(beerConverter.toDtoList(supplier.getBeers()));
        return supplierDto;
    }

    public Supplier toEntity(SupplierDto supplierDto) {
        Supplier supplier = new Supplier();
        supplier.setId(supplierDto.getId());
        supplier.setCountry(supplierDto.getCountry());
        supplier.setName(supplierDto.getName());
        supplier.setBeers(beerConverter.toEntityList(supplierDto.getBeers()));
        return supplier;
    }

    public List<SupplierDto> toDtoList(List<Supplier> suppliers) {
        List<SupplierDto> dtos = new ArrayList<>();
        for (Supplier supplier: suppliers) {
            dtos.add(toDto(supplier));
        }
        return dtos;
    }
}
