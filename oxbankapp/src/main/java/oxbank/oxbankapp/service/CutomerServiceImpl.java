package oxbank.oxbankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import oxbank.oxbankapp.entity.Customers;
import oxbank.oxbankapp.repository.CustomerRepo;

@Component
public class CutomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	@Override
	public String addCustomers(Customers customers) {
		// TODO Auto-generated method stub
		customerRepo.save(customers);
		return "Customer Added Successfully";
	}
	@Override
	public List<Customers> getAllCustomersDetails() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

}
