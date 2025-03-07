package np.com.esewa.learn.productservice.services.product;

import np.com.esewa.learn.productservice.resources.ProductRequest;
import np.com.esewa.learn.productservice.resources.ProductResponse;

import java.util.List;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * A service interface for product
 */
public interface ProductService {
    long addProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(long productId);

    List<ProductResponse> getProductsByCategory(String categoryName);

    void editProduct(long productId, ProductRequest productRequest);

    void deleteProductById(long productId);

    void addListOfProducts(List<ProductRequest> productRequest);
}
