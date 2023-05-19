package com.code9.beershop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String country;

    @OneToMany(mappedBy = "supplier")
    private List<Beer> beers;
}
