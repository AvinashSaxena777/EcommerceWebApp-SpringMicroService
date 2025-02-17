package np.com.esewa.learn.authenticationservice.repositories;

import np.com.esewa.learn.authenticationservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author AvinashSaxena
 * Written on: 04/01/2025
 * @project shopping-cart-micro-services
 * Repository for user
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {
    public Optional<User> findUserByUserNameAndPassword(String userName, String password);
}
