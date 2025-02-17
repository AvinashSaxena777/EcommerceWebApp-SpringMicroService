package np.com.esewa.orderservice.resources;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author AvinashSaxena
 * Written on: 04/01/2025
 * @project orderservice
 * a class for sending as an error response
 */
@Builder
@Setter
@Getter
public class ErrorResponse implements Serializable {
    private String errorMessage;
    private String errorCode;
}
