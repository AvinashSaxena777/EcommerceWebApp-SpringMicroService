package np.com.esewa.learn.productservice.repositories;

import np.com.esewa.learn.productservice.entities.Category;
import np.com.esewa.learn.productservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * A JPA repository for Product
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> getAllByCategory(Category category);
}
