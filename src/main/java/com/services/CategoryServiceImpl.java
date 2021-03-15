package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CategoryDaoImpl;
import com.entities.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryDaoImpl categoryDao;
	
	@Override
	@Transactional
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryDao.getAll();
	}

	@Override
	@Transactional
	public void save(Category newCategory) {
		// TODO Auto-generated method stub
		categoryDao.save(newCategory);
	}

	@Override
	@Transactional
	public Category get(int id) {
		// TODO Auto-generated method stub
		return categoryDao.get(id);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		categoryDao.delete(id);
	}

}
