package com.springboot.productmanagementsystem.service;

import java.util.List;

import com.springboot.productmanagementsystem.entities.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> getAllProduct();

	public Product getProductById(Integer id);

	public Product updateProduct(Integer id, Product product);

	public String deleteProduct(Integer id);

}
