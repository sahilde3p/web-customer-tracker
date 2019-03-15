package com.sahil.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahil.springdemo.dao.CustomerDao;
import com.sahil.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired 
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		List<Customer> c =customerDao.getCustomers();
		
		//Sorting Customers
		c.sort((a,b)->a.getFirstName().compareTo(b.getFirstName()));
		
		return c;
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer populateCustomer(int id) {
		return customerDao.populateCustomer(id);
		
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
		
	}

}
