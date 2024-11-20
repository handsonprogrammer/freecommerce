package org.freecommerce.catalogservice.dto;

public class ProductDto {

    Long productId;
    String name;
    String description;

    public ProductDto(Long productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
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

}
