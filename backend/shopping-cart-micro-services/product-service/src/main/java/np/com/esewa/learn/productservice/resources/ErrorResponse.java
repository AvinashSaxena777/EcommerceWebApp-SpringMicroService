package np.com.esewa.learn.productservice.resources;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * @project productservice
 * DTO for error response
 */

@Setter
@Getter
@Builder
public class ErrorResponse implements Serializable {
    private String errorMessage;
    private String errorCode;
}
