package com.code9.beershop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDto {

    private Long id;

    private String name;

    private String country;

    private List<BeerDto> beers = new ArrayList<>();

}
