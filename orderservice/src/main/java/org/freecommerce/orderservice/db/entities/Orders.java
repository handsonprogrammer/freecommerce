package org.freecommerce.orderservice.db.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ordersId;

    private Long userId;
    private String extOrderId;
    @Column(precision = 20, scale = 2)
    private BigDecimal totalProduct;
    @Column(precision = 20, scale = 2)
    private BigDecimal totalTax;
    @Column(length = 10)
    private String currency;
    private char status;
    private boolean locked;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDate timePlaced;
    @LastModifiedDate
    private LocalDate lastUpdate;

    public Long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Long ordersId) {
        this.ordersId = ordersId;
    }

    public String getExtOrderId() {
        return extOrderId;
    }

    public void setExtOrderId(String extOrderId) {
        this.extOrderId = extOrderId;
    }

    public BigDecimal getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(BigDecimal totalProduct) {
        this.totalProduct = totalProduct;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
