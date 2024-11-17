package com.pizzeria.pizzeriapatterndesign.strategy;

import com.pizzeria.pizzeriapatterndesign.model.Pedido;

public interface PromocionStrategy {
    void aplicar(Pedido pedido);
}
