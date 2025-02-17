package np.com.esewa.orderservice.resources;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import np.com.esewa.orderservice.enums.PaymentMode;

import java.io.Serializable;

/**
 * @author AvinashSaxena
 * Written on: 06/01/2025
 * @project orderservice
 * a DTO class as a resource for getting as request entity for order payemnt
 */
@Setter
@Getter
@Builder
@JsonIgnoreProperties
public class PaymentRequest implements Serializable {
    private String orderId;
    private float amount;
    private PaymentMode paymentMode;
}