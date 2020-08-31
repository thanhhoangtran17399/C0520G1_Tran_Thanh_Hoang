package bo;

import model.Product;

import java.util.List;

public interface ProductBo {
    List<Product> getListProduct();

    void save(Product product);

    Product findById(Integer id);

    void deleteById(Integer id);

    List<Product> searchByName(String name);
}
