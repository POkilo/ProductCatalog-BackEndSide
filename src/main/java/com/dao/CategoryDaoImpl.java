package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entities.Category;

@Repository
public class CategoryDaoImpl implements CategoryDaoInterface{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Category> result = session.createQuery("from Category order by name", Category.class).getResultList();
		return result;
	}

	@Override
	public void save(Category newCategory) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(newCategory);
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return  session.get(Category.class, id);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("delete from category where id =: categoryId").setParameter("categoryId", id).executeUpdate();
	}
}
