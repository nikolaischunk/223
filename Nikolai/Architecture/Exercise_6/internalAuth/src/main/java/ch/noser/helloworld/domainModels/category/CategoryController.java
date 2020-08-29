package ch.noser.helloworld.domainModels.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService CategoryService;

    @Autowired
    public CategoryController (CategoryService Service) {
        this.CategoryService = Service;
    }

    //localhost:8080/category GET SORTED
    @GetMapping("/asc")
    public @ResponseBody
    ResponseEntity<List<Category>> getCategoriesSortAsc() {
        return new ResponseEntity<>(CategoryService.sortListByNameAsc(), HttpStatus.OK);
    }

    //localhost:8080/category GET
    @GetMapping("/desc")
    public @ResponseBody ResponseEntity<List<Category>> getCategoriesSortDesc() {
        return new ResponseEntity<>(CategoryService.sortListByNameDesc(), HttpStatus.OK);
    }

    //localhost:8080/category/id UPDATE
    @PutMapping("/{id}")
    public @ResponseBody ResponseEntity<String> update (@PathVariable String id, @RequestBody Category NewCategory) {
        return new ResponseEntity<>(CategoryService.updateCategoryById(id, NewCategory), HttpStatus.OK);
    }

    //localhost:8080/category POST
    @PostMapping("")
    public @ResponseBody ResponseEntity<String> create (@RequestBody Category NewCategory) {
        return new ResponseEntity<>(CategoryService.postCategory(NewCategory), HttpStatus.CREATED);
    }

    //localhost:8080/category/id GET
    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity<Category> getById (@PathVariable String id){
        return new ResponseEntity<>(CategoryService.getCategoryById(id), HttpStatus.OK);
    }

    //localhost:8080/category/id DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody ResponseEntity<String> delete (@PathVariable String id){
        return new ResponseEntity<>(CategoryService.deleteCategory(id), HttpStatus.OK);
    }
}
