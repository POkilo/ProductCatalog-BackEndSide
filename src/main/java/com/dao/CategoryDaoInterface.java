package com.dao;

import java.util.List;

import com.entities.Category;

public interface CategoryDaoInterface {
	List<Category> getAll();
	void save(Category newCategory);
	Category get(int id);
	void delete(int id);
}
