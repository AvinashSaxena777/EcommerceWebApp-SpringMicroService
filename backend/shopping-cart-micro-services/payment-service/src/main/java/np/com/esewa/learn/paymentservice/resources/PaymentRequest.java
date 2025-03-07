package np.com.esewa.learn.paymentservice.resources;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import np.com.esewa.learn.paymentservice.enums.PaymentMode;

import java.io.Serializable;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * paymentservice
 * Resource DTO class for using as a payload for transaction requests
 */

@Setter
@Getter
@Builder
@JsonIgnoreProperties
public class PaymentRequest implements Serializable {
    private String orderId;
    private float amount;
    private String referenceNumber;
    private PaymentMode paymentMode;
}
