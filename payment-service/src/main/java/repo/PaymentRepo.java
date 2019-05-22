package repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Payment;

@Repository
public interface PaymentRepo extends CrudRepository {

    Payment findByTxnId(String txnId);
}