package np.com.esewa.learn.productservice.repositories;

import np.com.esewa.learn.productservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * @project shopping-cart-micro-services
 * A repository / DAO for product categories
 */
public interface CategoryRepository extends JpaRepository<Category, Short> {
     Category findCategoryByName(String name);
}
