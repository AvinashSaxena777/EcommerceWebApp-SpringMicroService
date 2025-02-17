package np.com.esewa.learn.paymentservice.services;

import np.com.esewa.learn.paymentservice.resources.PaymentRequest;
import np.com.esewa.learn.paymentservice.resources.PaymentResponse;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * @project paymentservice
 * A service interface for transactions and payment
 */
public interface PaymentService {
//    return paymentId after successful payment
    public long doPayment(PaymentRequest paymentRequest);
    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
