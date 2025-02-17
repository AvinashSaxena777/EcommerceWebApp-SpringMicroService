package np.com.esewa.learn.paymentservice.resources;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * @project paymentservice
 * Custom response entity class for errors
 */
@Builder
@Setter
@Getter
public class ErrorResponse implements Serializable {
    private String errorMessage;
    private String errorCode;
}
