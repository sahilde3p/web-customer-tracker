package com.sahil.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sahil.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Customer> getCustomers() 
	{
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer>	 query = session.createQuery("from Customer",Customer.class);
		List<Customer> customers = query.getResultList();
		
	
		return customers;
	}


	@Override
	public void saveCustomer(Customer customer) 
	{
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(customer);
		
	}


	@Override
	public Customer populateCustomer(int id) 
	{
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Customer.class, id);
		
		
		
	}


	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		session.delete(session.get(Customer.class, id));
		
	}
	
	

}
