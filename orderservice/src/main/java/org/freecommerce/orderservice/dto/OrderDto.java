package org.freecommerce.orderservice.dto;

import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderDto {

    private Long ordersId;

    private Long userId;
    private String extOrderId;

    private BigDecimal totalProduct;

    private BigDecimal totalTax;
    private String currency;
    private char status;
    private boolean locked;

    private LocalDate timePlaced;
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

    public LocalDate getTimePlaced() {
        return timePlaced;
    }

    public void setTimePlaced(LocalDate timePlaced) {
        this.timePlaced = timePlaced;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
