package np.com.esewa.learn.productservice.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * Entity for product
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;
    @Column(name = "product_name")
    private String productName;
    private float price;
    private int quantity;
    private String imageLink;
    private String description;
    @ManyToOne
    private Category category;
}
