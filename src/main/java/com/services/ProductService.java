package com.services;

import java.util.List;

import com.entities.Product;

public interface ProductService {
	List<Product> getAll();
	List<List<Product>> getByCategory();
	void save(Product newProduct);
	void delete(int id);
	Product get(int id);
}
