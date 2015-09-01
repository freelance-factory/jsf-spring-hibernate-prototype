package com.mkyong.customer.service.impl;
 
import java.util.List;
 
import com.mkyong.customer.service.CustomerService;
import com.mkyong.customer.dao.CustomerDao;
import com.mkyong.customer.model.Customer;
 
public class CustomerServiceImpl implements CustomerService {
 
	CustomerDao customerDao;
 
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
 
	public void addCustomer(Customer customer){
 
		customerDao.addCustomer(customer);
 
	}
 
	public List<Customer> findAllCustomer(){
 
		return customerDao.findAllCustomer();
	}
}