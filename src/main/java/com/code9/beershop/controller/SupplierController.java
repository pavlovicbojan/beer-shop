package com.code9.beershop.controller;

import com.code9.beershop.convertor.SupplierConverter;
import com.code9.beershop.dto.SupplierDto;
import com.code9.beershop.model.Supplier;
import com.code9.beershop.service.SupplierService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
@Validated
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @Autowired
    private SupplierConverter supplierConverter;

    @PostMapping("/saveSupplier")
    public ResponseEntity<SupplierDto> saveSupplier(@Valid @RequestBody SupplierDto supplierDto) {
        Supplier savedSupplier = supplierService.save(supplierConverter.toEntity(supplierDto));
        return new ResponseEntity<>(supplierConverter.toDto(savedSupplier), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<SupplierDto>> getAllSuppliers() {
        List<SupplierDto> supplierDtos =supplierConverter.toDtoList(supplierService.findAll());
        return new ResponseEntity<>(supplierDtos, HttpStatus.OK);
    }

}
