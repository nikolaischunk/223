package ch.noser.helloworld.domainModels.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService ProductService;

    @Autowired
    public ProductController (ProductService ProductService) {
        this.ProductService = ProductService;
    }

    //localhost:8080/products GET SORTED
    @GetMapping("/asc")
    public @ResponseBody ResponseEntity<List<Product>> getProductsSortAsc() {
        return new ResponseEntity<>(ProductService.sortListByPriceAsc(), HttpStatus.OK);
    }

    //localhost:8080/products GET
    @GetMapping("/desc")
    public @ResponseBody ResponseEntity<List<Product>> getProductsSortDesc() {
        return new ResponseEntity<>(ProductService.sortListByPriceDesc(), HttpStatus.OK);
    }

    //localhost:8080/products/id UPDATE
    @PutMapping("/{id}")
    public @ResponseBody ResponseEntity<String> update (@PathVariable String id, @RequestBody Product NewProduct) {
        return new ResponseEntity<>(ProductService.updateProductById(id, NewProduct), HttpStatus.OK);
    }

    //localhost:8080/products POST
    @PostMapping("")
    public @ResponseBody ResponseEntity<String> create (@RequestBody Product NewProduct) {
        return new ResponseEntity<>(ProductService.postProduct(NewProduct), HttpStatus.CREATED);
    }

    //localhost:8080/products/id GET
    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity<Product> getById(@PathVariable String id){
        return new ResponseEntity<>(ProductService.getProductById(id), HttpStatus.OK);
    }

    //localhost:8080/products/id DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<>(ProductService.deleteProduct(id), HttpStatus.OK);
    }
}