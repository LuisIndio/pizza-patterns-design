package com.pizzeria.pizzeriapatterndesign.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private boolean esPersonalizada;

    @OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL)
    private List<Ingrediente> ingredientes;

}
