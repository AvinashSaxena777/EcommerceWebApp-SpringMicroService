package np.com.esewa.learn.paymentservice.exceptions;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * @project payment service
 * Custom Exception class for Transaction Not Found
 */
public class TransactionNotFoundException extends RuntimeException {
    public TransactionNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }

}
