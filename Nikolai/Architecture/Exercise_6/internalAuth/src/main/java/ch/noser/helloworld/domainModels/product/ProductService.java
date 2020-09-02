package ch.noser.helloworld.domainModels.product;

import java.util.List;

public interface ProductService {

    //returns the list sorted asc after price
    List<Product> sortListByPriceAsc ();

    //returns the list sorted desc after price
    List<Product> sortListByPriceDesc ();

    //returns a product by id
    Product getProductById (String id);

    //updates a product
    String updateProductById(String id, Product NewProduct);

    //posts a product
    String postProduct(Product NewProduct);

    //deletes product by ID
    String deleteProduct (String id);

}
