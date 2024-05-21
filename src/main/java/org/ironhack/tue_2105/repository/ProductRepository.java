package org.ironhack.tue_2105.repository;

import org.ironhack.tue_2105.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName(String name);

    //JPQL    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<Product> findByPriceGreaterThan(Double price);
}
