package com.code9.beershop.service;

import com.code9.beershop.model.Supplier;

import java.util.List;

public interface SupplierService {

    Supplier findById(Long id);

    Supplier save(Supplier supplier);

    List<Supplier> findAll();
 }
