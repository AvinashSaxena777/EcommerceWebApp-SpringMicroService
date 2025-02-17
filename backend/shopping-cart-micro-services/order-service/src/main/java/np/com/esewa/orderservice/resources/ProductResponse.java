package np.com.esewa.orderservice.resources;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author AvinashSaxena
 * Written on: 06/01/2025
 * @project orderservice
 * response class for product
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse implements Serializable {
    private long productId;
    private String productName;
    private int quantity;
    private float price;
}
