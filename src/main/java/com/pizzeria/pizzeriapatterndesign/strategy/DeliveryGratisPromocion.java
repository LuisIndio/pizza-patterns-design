package com.pizzeria.pizzeriapatterndesign.strategy;

import com.pizzeria.pizzeriapatterndesign.model.Pedido;

public class DeliveryGratisPromocion implements PromocionStrategy {
    @Override
    public void aplicar(Pedido pedido) {
        pedido.setDeliveryGratis(true);
    }
}

