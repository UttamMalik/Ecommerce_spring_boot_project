package UttamMalik.Ecommerce.repository;

import UttamMalik.Ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
