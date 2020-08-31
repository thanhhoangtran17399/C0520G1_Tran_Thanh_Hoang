package bo;

import dao.ProductDaoImpl;
import model.Product;

import java.util.List;

public class ProductBoImpl implements ProductBo{
    private ProductDaoImpl productDao = new ProductDaoImpl();
    @Override
    public List<Product> getListProduct() {
        return productDao.getListProduct();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public Product findById(Integer id) {
        return productDao.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        productDao.deleteById(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productDao.searchByName(name);
    }
}
