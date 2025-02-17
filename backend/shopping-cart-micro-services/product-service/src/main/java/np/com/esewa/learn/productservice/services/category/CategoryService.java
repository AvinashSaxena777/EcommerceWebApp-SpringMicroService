package np.com.esewa.learn.productservice.services.category;

import np.com.esewa.learn.productservice.entities.Category;

import java.util.List;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * @project shopping-cart-micro-services
 * Services for product Category
 */
public interface CategoryService {
    public String[] getAllCategories();

    void addCategory(Category category);

    Category getCategoryByName(String categoryName);

}
