package com.pizzeria.pizzeriapatterndesign.service;

import com.pizzeria.pizzeriapatterndesign.model.Pedido;
import com.pizzeria.pizzeriapatterndesign.repository.PedidoRepository;
import com.pizzeria.pizzeriapatterndesign.strategy.PromocionStrategy;
import com.pizzeria.pizzeriapatterndesign.strategy.PromocionStrategyFactory;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final PromocionStrategyFactory promocionStrategyFactory;

    public PedidoService(PedidoRepository pedidoRepository, PromocionStrategyFactory promocionStrategyFactory) {
        this.pedidoRepository = pedidoRepository;
        this.promocionStrategyFactory = promocionStrategyFactory;
    }

    public Pedido realizarPedido(Pedido pedido) {
        PromocionStrategy estrategia = promocionStrategyFactory.getPromocionStrategy(pedido.getFecha());

        estrategia.aplicar(pedido);

        return pedidoRepository.save(pedido);
    }
}


