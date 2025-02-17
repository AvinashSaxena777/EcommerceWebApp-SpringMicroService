package np.com.esewa.learn.authenticationservice.tokenutils;

import np.com.esewa.learn.authenticationservice.model.User;

import java.util.Map;

/**
 * @author AvinashSaxena
 * Written on: 04/01/2025
 * @project shopping-cart-micro-services
 * @description @
 */
public interface JwtGenerator {
    Map<String, String> generateToken(User user);
}
