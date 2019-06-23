package oxbank.oxbankapp.service;

import oxbank.oxbankapp.entity.Loans;

public interface LoanService {
	public String addLoanToCustomers(Loans loan, Long customerId );

}
