package com.pizzeria.pizzeriapatterndesign.strategy;

import com.pizzeria.pizzeriapatterndesign.model.Pedido;
import com.pizzeria.pizzeriapatterndesign.model.Pizza;

import java.util.List;

public class DosPorUnoPromocion implements PromocionStrategy {
    @Override
    public void aplicar(Pedido pedido) {
        List<Pizza> pizzas = pedido.getPizzas();
        if (pizzas.size() > 1) {
            int cantidadExtra = pizzas.size();
            for (int i = 0; i < cantidadExtra; i++) {
                Pizza pizzaGratis = new Pizza();
                pizzaGratis.setNombre("Promoción 2x1 - " + pizzas.get(i % pizzas.size()).getNombre());
                pizzaGratis.setEsPersonalizada(false);
                pizzas.add(pizzaGratis);
            }
        }
    }
}

