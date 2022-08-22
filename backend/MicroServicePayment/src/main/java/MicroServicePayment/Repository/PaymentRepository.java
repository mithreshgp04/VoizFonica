package MicroServicePayment.Repository;

import org.hibernate.Session;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




import MicroServicePayment.Entity.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {

	void deleteByid(int id);

}