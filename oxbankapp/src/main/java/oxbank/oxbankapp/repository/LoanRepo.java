package oxbank.oxbankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import oxbank.oxbankapp.entity.Loans;

public interface LoanRepo extends JpaRepository<Loans, Long> {

}
