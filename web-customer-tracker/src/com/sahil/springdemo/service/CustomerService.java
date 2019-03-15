package com.sahil.springdemo.service;

import java.util.List;

import com.sahil.springdemo.entity.Customer;

public interface CustomerService 
{
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer populateCustomer(int id);

	public void deleteCustomer(int id);

}
