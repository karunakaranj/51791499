package oxbank.oxbankapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import oxbank.oxbankapp.entity.Customers;
import oxbank.oxbankapp.entity.Loans;
import oxbank.oxbankapp.repository.CustomerRepo;
import oxbank.oxbankapp.repository.LoanRepo;

@Component
public class LoanServiceImpl implements LoanService{

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	LoanRepo loanRepo;
	@Override
	public String addLoanToCustomers(Loans loan, Long customerId) {
		Customers customer=customerRepo.findCustomer(customerId);
		//Double loanAmout=loan.getLoanAmount();
		loan.setLoanStatus("Not Passed");
		
		Long creditScore=customer.getCreditScore();
		if("married".equalsIgnoreCase(customer.getMaritalStatus()) && customer.getAge()>24 && customer.getAge() <29)
			loan.setLoanStatus("NOt Passed");
		if(creditScore >600 && customer.getAge()>24 && customer.getAge() <60) {
			
			loan.setCustomer(customer);
			loanRepo.save(loan);
			
		}
		
		return "Loans is Added to Respective Customer";
	}

}
