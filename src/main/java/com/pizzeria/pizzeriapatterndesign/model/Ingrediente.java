package com.pizzeria.pizzeriapatterndesign.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

}
