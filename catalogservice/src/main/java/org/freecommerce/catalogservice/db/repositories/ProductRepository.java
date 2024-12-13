package org.freecommerce.catalogservice.db.repositories;

import org.freecommerce.catalogservice.db.entities.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface ProductRepository extends ListCrudRepository<Product, String>, ListPagingAndSortingRepository<Product, String> {
}
