package np.com.esewa.learn.paymentservice.repositories;

import np.com.esewa.learn.paymentservice.entities.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * @project paymentservice
 * A repository extendation for transaction entities
 */

@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Long> {
    Optional<TransactionDetails> findByOrderId(String orderId);
}
