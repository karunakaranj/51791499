package oxbank.oxbankapp.service;

import java.util.List;

import oxbank.oxbankapp.entity.Customers;

public interface CustomerService {
	
	public String addCustomers(Customers customers);
	public List<Customers> getAllCustomersDetails();

}
