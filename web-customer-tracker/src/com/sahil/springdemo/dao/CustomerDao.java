package com.sahil.springdemo.dao;

import java.util.List;

import com.sahil.springdemo.entity.Customer;

public interface CustomerDao 
{
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer populateCustomer(int id);

	public void deleteCustomer(int id);
	
}
