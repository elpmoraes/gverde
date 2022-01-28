package com.gverde.gverde.repositories;

import com.gverde.gverde.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
