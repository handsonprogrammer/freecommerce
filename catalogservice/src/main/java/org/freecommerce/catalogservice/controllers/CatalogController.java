package org.freecommerce.catalogservice.controllers;

import org.freecommerce.catalogservice.db.entities.Product;
import org.freecommerce.catalogservice.db.repositories.ProductRepository;
import org.freecommerce.catalogservice.dto.Price;
import org.freecommerce.catalogservice.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/getAllProducts")
    public List<ProductDto> getAllProducts(){
        return productRepository.findAll()
                                    .stream()
                                    .map( (e) -> {
                                        ProductDto product =new ProductDto(e.getProductID(),e.getName(),e.getDescription());
                                        product.setPrice(new Price(e.getPrice().getCurrency(),e.getPrice().getDiscount_level(),e.getPrice().getDiscounted_value(),e.getPrice().isOn_sales(),e.getPrice().getValue()));
                                        return product;
                                    })
                                    .collect(Collectors.toList());
    }

    @PostMapping
    public void loadProducts(){
        productRepository.save(new Product("1","Iphone 16","This is Iphone"));
        productRepository.save(new Product("2","Iphone 16 Plus","This is Iphone"));
        productRepository.save(new Product("3","Iphone 16 Pro","This is Iphone"));
        productRepository.save(new Product("4","Iphone 16 Pro Max","This is Iphone"));
    }
}
