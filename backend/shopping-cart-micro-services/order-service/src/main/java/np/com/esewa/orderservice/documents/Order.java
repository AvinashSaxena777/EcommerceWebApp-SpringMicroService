package np.com.esewa.orderservice.documents;

import jakarta.annotation.Generated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import np.com.esewa.orderservice.enums.OrderStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

/**
 * @author AvinashSaxena
 * Written on: 06/01/2025
 * @project orderservice
 * database entity instance for orders
 */
@Setter
@Getter
@Builder
@Document(collection = "orders")
public class Order {
//    @Transient
//    public static final String SEQUENCE_NAME = "orders_sequence";

    @Id
    private String id;
    
    private long productId;

    private int quantity;

    private Instant orderDate;

    private OrderStatus orderStatus;

    private String deliveryAddress;

    private float amount;
}
