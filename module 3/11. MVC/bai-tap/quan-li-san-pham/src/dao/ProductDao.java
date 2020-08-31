package dao;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDao {
    private static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "phone", 3000000, "Smart Phone", "lg"));
        productMap.put(2, new Product(2, "shirt", 1000000, "Tee Shirt", "champion"));
        productMap.put(3, new Product(3, "car", 1000000000, "Sport Car", "lambogini"));
    }

    public static List<Product> getListProduct(){
        return new ArrayList<>(productMap.values());
    }

    public static void save(Product product) {
        productMap.put(product.getId(), product);
    }

    public static Product findById(Integer id) {
        return productMap.get(id);
    }

    public static void deleteById(Integer id) {
        productMap.remove(id);
    }
}
