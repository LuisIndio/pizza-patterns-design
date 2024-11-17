package com.pizzeria.pizzeriapatterndesign.repository;

import com.pizzeria.pizzeriapatterndesign.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    List<Pizza> findByNombre(String nombre);

    List<Pizza> findByEsPersonalizadaFalse();
}

