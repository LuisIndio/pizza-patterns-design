package com.pizzeria.pizzeriapatterndesign.strategy;

import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Component
public class PromocionStrategyFactory {

    public PromocionStrategy getPromocionStrategy(LocalDate fecha) {
        DayOfWeek dia = fecha.getDayOfWeek();
        if (dia == DayOfWeek.TUESDAY || dia == DayOfWeek.WEDNESDAY) {
            return new DosPorUnoPromocion();
        } else if (dia == DayOfWeek.THURSDAY) {
            return new DeliveryGratisPromocion();
        }
        return new SinPromocion();
    }
}
