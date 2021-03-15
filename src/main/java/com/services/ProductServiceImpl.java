package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDaoInterface;
import com.entities.Category;
import com.entities.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDaoInterface productDao;
	
	@Override
	@Transactional
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productDao.getAll();
	}

	@Override
	@Transactional
	public List<List<Product>> getByCategory() {
		// TODO Auto-generated method stub
		List<Product> products = productDao.getByCategory();
		List<List<Product>> result = new ArrayList<>();
		Category currentCategory = null;
		int index=-1;
		for(Product p:products) {
			if(!p.getCategory().equals(currentCategory)) {
				currentCategory = p.getCategory();
				result.add(new ArrayList<Product>());
				index++;
			}
			result.get(index).add(p);
		}
		return result;
	}

	@Override
	@Transactional
	public void save(Product newProduct) {
		// TODO Auto-generated method stub
		productDao.save(newProduct);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		productDao.delete(id);
	}

	@Override
	@Transactional
	public Product get(int id) {
		// TODO Auto-generated method stub
		return productDao.get(id);
	}

}
