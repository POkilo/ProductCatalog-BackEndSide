package com.dao;

import java.util.List;

import com.entities.Product;

public interface ProductDaoInterface {
	List<Product> getAll();
	List<Product> getByCategory();
	void save(Product newProduct);
	void delete(int id);
	Product get(int id);
	
}
