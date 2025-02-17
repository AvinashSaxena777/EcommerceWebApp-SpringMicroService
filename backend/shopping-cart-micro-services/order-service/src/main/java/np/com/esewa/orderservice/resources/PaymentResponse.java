package np.com.esewa.orderservice.resources;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import np.com.esewa.orderservice.enums.PaymentMode;
import np.com.esewa.orderservice.enums.PaymentStatus;

import java.io.Serializable;
import java.time.Instant;

/**
 * @author AvinashSaxena
 * Written on: 06/01/2025
 * @project orderservice
 * a DTO class as a resource for sending as response entity for order payment
 */

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class PaymentResponse implements Serializable {
    private long paymentId;
    private String status;
    private PaymentMode paymentMode;
    private float amount;
    private Instant paymentDate;
    private String orderId;
}