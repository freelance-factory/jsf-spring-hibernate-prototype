package com.mkyong.customer.service;
 
import java.util.List;
 
import com.mkyong.customer.model.Customer;
 
public interface CustomerService {
 
	void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
 
}