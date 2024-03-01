package com.springboot.productmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.productmanagementsystem.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
