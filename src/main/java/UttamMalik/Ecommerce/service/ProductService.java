package UttamMalik.Ecommerce.service;

import UttamMalik.Ecommerce.model.Category;
import UttamMalik.Ecommerce.model.Product;
import UttamMalik.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllproduct(){
        return productRepository.findAll();
    }
}
