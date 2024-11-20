package org.freecommerce.catalogservice.controllers;

import org.freecommerce.catalogservice.db.entities.Product;
import org.freecommerce.catalogservice.db.repositories.ProductRepository;
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
                                    .map( e -> new ProductDto(e.getProductId(),e.getName(),e.getDescription()))
                                    .collect(Collectors.toList());
    }

    @PostMapping
    public void loadProducts(){
        productRepository.save(new Product(1L,"Iphone 16","This is Iphone"));
        productRepository.save(new Product(2L,"Iphone 16 Plus","This is Iphone"));
        productRepository.save(new Product(3L,"Iphone 16 Pro","This is Iphone"));
        productRepository.save(new Product(4L,"Iphone 16 Pro Max","This is Iphone"));
    }
}
