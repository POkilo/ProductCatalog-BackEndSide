package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDaoInterface{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> result = session.createQuery("from product p", Product.class).getResultList();
		session.close();
		
		return result;
	}
	
	@Override
	public List<Product> getByCategory() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> result = session.createQuery("from Product order by category", Product.class).getResultList();
		
		return result;
	}

	@Override
	public void save(Product newProduct) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(newProduct);
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Product.class, id);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("delete from product where id =: productId").setParameter("productId", id).executeUpdate();	
	}
	
}
