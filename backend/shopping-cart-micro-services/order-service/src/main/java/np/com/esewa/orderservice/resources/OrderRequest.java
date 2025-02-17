package np.com.esewa.orderservice.resources;

import lombok.*;
import np.com.esewa.orderservice.enums.PaymentMode;

/**
 * @author AvinashSaxena
 * Written on: 06/01/2025
 * @project orderservice
 * a DTO class as a resource for getting as request entity for order
 */
@Data
@Builder
public class OrderRequest {
    private long productId;
    private float totalAmount;
    private int quantity;
    private String deliveryAddress;
    private PaymentMode paymentMode;
}
