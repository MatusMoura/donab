package com.nerdfurios.donab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nerdfurios.donab.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
