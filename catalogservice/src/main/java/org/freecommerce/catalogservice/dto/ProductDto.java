package org.freecommerce.catalogservice.dto;

public class ProductDto {

    String productId;
    String name;
    String description;

    Price price;

    public ProductDto(String productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}

