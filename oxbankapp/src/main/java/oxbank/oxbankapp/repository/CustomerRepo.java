package oxbank.oxbankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import oxbank.oxbankapp.entity.Customers;

public interface CustomerRepo  extends JpaRepository<Customers, Long>{
	@Query("SELECT c from Customers c where c.customerId=:custId")
	public Customers findCustomer(@Param("custId")Long custId);

}
