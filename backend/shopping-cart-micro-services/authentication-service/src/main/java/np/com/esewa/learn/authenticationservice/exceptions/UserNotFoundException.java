package np.com.esewa.learn.authenticationservice.exceptions;

/**
 * @author AvinashSaxena
 * Written on: 04/01/2025
 * @project shopping-cart-micro-services
 * @description @
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
