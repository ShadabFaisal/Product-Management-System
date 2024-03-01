package com.springboot.productmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.productmanagementsystem.entities.Product;
import com.springboot.productmanagementsystem.exceptions.ProductNotFoundException;
import com.springboot.productmanagementsystem.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public Product saveProduct(Product product) {
		Product savedProduct=repo.save(product);
		return savedProduct;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> productList=repo.findAll();
		return productList;
	}

	@Override
	public Product getProductById(Integer id) {
		Product product=repo.findById(id).orElseThrow(ProductNotFoundException::new);
		return product;
	}

	@Override
	public Product updateProduct(Integer id, Product product) {
		Product p=repo.findById(id).orElseThrow(ProductNotFoundException::new);
		p.setProductName(product.getProductName());
		p.setDescription(product.getDescription());
		p.setPrice(product.getPrice());
		p.setStatus(product.getStatus());
		
		Product updatedProduct=repo.save(p);
		return updatedProduct;
	}

	@Override
	public String deleteProduct(Integer id) {
		repo.deleteById(id);
		return "Product Deleted!";
	}

}
