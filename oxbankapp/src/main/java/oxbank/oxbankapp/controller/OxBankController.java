package oxbank.oxbankapp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oxbank.oxbankapp.entity.Customers;
import oxbank.oxbankapp.entity.Loans;
import oxbank.oxbankapp.entity.Managers;
import oxbank.oxbankapp.service.CustomerService;
import oxbank.oxbankapp.service.LoanService;

@RestController
@RequestMapping("/oxbank/api")
public class OxBankController {
	@Autowired
	CustomerService customerServiceImpl;
	
	@Autowired
	LoanService loanService;
	
	@PostMapping("/customers/add")
	public String addCustomers(@RequestBody Customers customers) {
		return customerServiceImpl.addCustomers(customers);
		
	}
	
	@GetMapping("/customers/get")
	public List<Customers> getAllCustomersDetails(){
		return null;
		
	}
	
	@PostMapping("/managers/add")
	public String addManagers(@RequestBody Managers managers) {
		return null;
	}
	
	/*
	 * @PostMapping("/managers/{managerId}/customer/{customerId}/loanapproval")
	 * public String loanApproval(@PathVariable managerId,@PathVariable customerId)
	 * { return null; }
	 */
	@PostMapping("/cutomers/{customerId}/loans/add")
	public String addLoanToCustomers(@RequestBody Loans loans,@PathVariable Long customerId) {
		return loanService.addLoanToCustomers(loans, customerId);
	}
	
	
}
