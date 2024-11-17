package com.pizzeria.pizzeriapatterndesign.repository;

import com.pizzeria.pizzeriapatterndesign.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
    List<Ingrediente> findByNombre(String nombre);

    List<Ingrediente> findByPizza_Id(Long pizzaId);
}

