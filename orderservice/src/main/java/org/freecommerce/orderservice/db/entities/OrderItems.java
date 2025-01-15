package org.freecommerce.orderservice.db.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderItemsId;

    @Column(nullable = false)
    private String productId;
    @Column(nullable = false,length = 64)
    private String sku;
    @Column(precision = 20, scale = 2)
    private BigDecimal price;
    private float quantity;
    @Column(precision = 20, scale = 2)
    private BigDecimal totalProduct;
    @Column(length = 10)
    private String currency;

    @Column(precision = 20, scale = 2)
    private BigDecimal taxAmount;

    private LocalDate lastUpdate;
}
