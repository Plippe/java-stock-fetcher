package stores;

import com.secret.app.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import static com.secret.app.products.Product.ProductKey;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product,Long>{

    Product findOne(ProductKey key);
}
