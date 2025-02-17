package np.com.esewa.orderservice.services;

import np.com.esewa.orderservice.resources.OrderRequest;
import np.com.esewa.orderservice.resources.OrderResponse;
import org.springframework.stereotype.Service;

/**
 * @author AvinashSaxena
 * Written on: 06/01/2025
 * @project orderservice
 * Service interface for orders
 */

@Service
public interface OrderService {
    String placeOrder(OrderRequest orderRequest, String authorizationToken);

    OrderResponse getOrderDetails(String orderId, String authorizationToken);
}
