package com.pizzeria.pizzeriapatterndesign.service;

import com.pizzeria.pizzeriapatterndesign.model.Pizza;
import com.pizzeria.pizzeriapatterndesign.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> listarPizzas() {
        return pizzaRepository.findAll();
    }

    public Pizza crearPizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }
}

