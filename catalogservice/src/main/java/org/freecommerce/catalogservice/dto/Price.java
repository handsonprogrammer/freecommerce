package org.freecommerce.catalogservice.dto;

public class Price {
    String currency;
    double discount_level;
    double discounted_value;
    boolean on_sales;
    double value;

    public Price(String currency, double discount_level, double discounted_value, boolean on_sales, double value) {
        this.currency = currency;
        this.discount_level = discount_level;
        this.discounted_value = discounted_value;
        this.on_sales = on_sales;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getDiscount_level() {
        return discount_level;
    }

    public void setDiscount_level(double discount_level) {
        this.discount_level = discount_level;
    }

    public double getDiscounted_value() {
        return discounted_value;
    }

    public void setDiscounted_value(double discounted_value) {
        this.discounted_value = discounted_value;
    }

    public boolean isOn_sales() {
        return on_sales;
    }

    public void setOn_sales(boolean on_sales) {
        this.on_sales = on_sales;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


}
