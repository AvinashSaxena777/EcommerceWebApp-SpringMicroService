package np.com.esewa.learn.productservice.exceptions;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * @project productservice
 * Custom Exception class for Product Not Found
 */
public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }

}
