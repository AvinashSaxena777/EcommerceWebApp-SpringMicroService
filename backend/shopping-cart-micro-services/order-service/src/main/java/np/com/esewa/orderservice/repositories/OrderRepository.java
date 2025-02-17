package np.com.esewa.orderservice.repositories;

import np.com.esewa.orderservice.documents.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author AvinashSaxena
 * Written on: 06/01/2025
 * @project orderservice
 * a repository extendation child of mongo repository for order
 */
public interface OrderRepository extends MongoRepository<Order, String> {
}
