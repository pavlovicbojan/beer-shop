package com.code9.beershop.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {

    private Long id;

    @NotNull
    private String name;

    @NotEmpty
    private List<IngredientDto> ingredients = new ArrayList<>();

    @NotNull
    private Long supplierId;
}
