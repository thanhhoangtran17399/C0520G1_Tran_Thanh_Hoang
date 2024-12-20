package dao;

import model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getListProduct();

    void save(Product product);

    Product findById(Integer id);

    void deleteById(Integer id);

    List<Product> searchByName(String name);
}
