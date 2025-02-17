package np.com.esewa.learn.authenticationservice.dtos;

import java.io.Serializable;

/**
 * @author AvinashSaxena
 * Written on: 04/01/2025
 * @project shopping-cart-micro-services
 * @description @
 */
public class RegisterSuccessResponse implements Serializable {
    private String message;

    public RegisterSuccessResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
