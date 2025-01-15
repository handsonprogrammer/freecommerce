package org.freecommerce.orderservice.db.repositories;

import org.freecommerce.orderservice.db.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository  extends JpaRepository<Orders, Long> {
}
