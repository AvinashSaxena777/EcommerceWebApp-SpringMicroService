package np.com.esewa.orderservice.exceptions;

/**
 * @author AvinashSaxena
 * Written on: 06/01/2025
 * @project orderservice
 * custom exception for order not found
 */
public class OrderNoFoundException extends RuntimeException{
    public OrderNoFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
