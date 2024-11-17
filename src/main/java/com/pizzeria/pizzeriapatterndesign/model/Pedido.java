package com.pizzeria.pizzeriapatterndesign.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private boolean deliveryGratis;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<Pizza> pizzas;

}

