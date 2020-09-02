package ch.noser.helloworld.domainModels.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public List<Product> sortListByPriceAsc() {
        List<Product> products = repo.findAll();
        products.sort(Comparator.comparing(Product::getPrice));
        return products;
    }

    @Override
    public List<Product> sortListByPriceDesc() {
        List<Product> products = repo.findAll();
        products.sort(Comparator.comparing(Product::getPrice).reversed());
        return products;
    }

    @Override
    public Product getProductById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String updateProductById(String id, Product NewProduct) {
        Product product = getProductById(id);
        product.setPrice(NewProduct.getPrice());
        product.setProductBez(NewProduct.getProductBez());
        repo.save(product);
        return "Product with ID " + id + " saved!";
    }

    @Override
    public String postProduct(Product NewProduct) {
        System.out.println(NewProduct);
        repo.save(NewProduct);
        return "Product created!";
    }

    @Override
    public String deleteProduct(String id) {
        repo.deleteById(id);
        return "Product with ID " + id + " deleted!";
    }
}
