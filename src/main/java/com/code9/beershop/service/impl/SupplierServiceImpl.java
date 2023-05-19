package com.code9.beershop.service.impl;

import com.code9.beershop.model.Supplier;
import com.code9.beershop.repository.SupplierRepository;
import com.code9.beershop.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Supplier findById(Long id) {
        return supplierRepository.findById(id).get();
    }

    @Override
    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }
}
