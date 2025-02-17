package np.com.esewa.learn.productservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author AvinashSaxena
 * Written on: 08/01/2025
 * @project shopping-cart-micro-services
 * An entity for category of producsts
 */

@Getter
@Setter
@Entity(name = "categories")
public class Category {
    @Id
    private short id;
    private String name;
}
