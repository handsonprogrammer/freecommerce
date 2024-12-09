package org.freecommerce.catalogservice.db.repositories;

import org.freecommerce.catalogservice.db.entities.Product;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment =
        SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepository;

    @Mock
    Environment env;

    @BeforeAll
    public static void beforeAll() {
        mongoDBContainer.start();
    }

    @Container
    static MongoDBContainer mongoDBContainer =
            new MongoDBContainer("mongo:6.0.4").withEnv("MONGO_INITDB_DATABASE","testdb");

    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("mongo.dbname", ()->String.valueOf("testdb"));
        registry.add("mongo.host", ()-> mongoDBContainer.getHost());
        registry.add("mongo.port", ()-> mongoDBContainer.getFirstMappedPort());
    }

    @Test
    @Order(1)
    void add() {
        productRepository.save(new Product("1","Iphone 16","This is Iphone"));
        productRepository.save(new Product("2","Iphone 16 Plus","This is Iphone"));
        productRepository.save(new Product("3","Iphone 16 Pro","This is Iphone"));
        productRepository.save(new Product("4","Iphone 16 Pro Max","This is Iphone"));
        assertNotNull(productRepository.findAll());
        assertEquals(4, productRepository.findAll().size());
    }
}
