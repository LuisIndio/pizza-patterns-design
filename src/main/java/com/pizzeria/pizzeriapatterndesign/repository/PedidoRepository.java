package com.pizzeria.pizzeriapatterndesign.repository;

import com.pizzeria.pizzeriapatterndesign.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByFecha(LocalDate fecha);

    List<Pedido> findByDeliveryGratisTrue();
}

