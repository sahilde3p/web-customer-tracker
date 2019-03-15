package com.sahil.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sahil.springdemo.entity.Customer;
import com.sahil.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel)
	{
		List<Customer> customers = customerService.getCustomers();
		
		theModel.addAttribute("customers", customers);
		return "list-customer";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@PostMapping("/processForm")
	public String saveCustomer(@ModelAttribute Customer customer)
	{
		
		customerService.saveCustomer(customer);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String updateCustomer(Model model,@RequestParam("customerId") int id)
	{
		model.addAttribute("customer",customerService.populateCustomer(id));
		
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(Model model,@RequestParam("customerId") int id)
	{
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
	

	
	

}
