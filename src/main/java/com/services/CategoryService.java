package com.services;

import java.util.List;

import com.entities.Category;

public interface CategoryService {
	List<Category> getAll();
	void save(Category newCategory);
	Category get(int id);
	void delete(int id);
}
