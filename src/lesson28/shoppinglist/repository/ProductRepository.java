package lesson28.shoppinglist.repository;

import lesson28.shoppinglist.dto.ProductDto;
import lesson28.shoppinglist.entity.Product;

import java.util.List;

public interface ProductRepository {

    Integer addProduct(ProductDto productDto);
    List<Product> findAll();
    Product findById(Integer id);
    boolean deleteById(Integer id);
}
