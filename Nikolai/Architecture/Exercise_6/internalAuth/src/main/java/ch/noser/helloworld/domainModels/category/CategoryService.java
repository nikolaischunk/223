package ch.noser.helloworld.domainModels.category;

import java.util.List;

public interface CategoryService {

    //returns the list sorted asc after price
    List<Category> sortListByNameAsc ();

    //returns the list sorted desc after price
    List<Category> sortListByNameDesc ();

    //returns a category by id
    Category getCategoryById (String id);

    //updates a category
    String updateCategoryById(String id, Category NewCategory);

    //posts a category
    String postCategory(Category NewCategory);

    //deletes category by ID
    String deleteCategory (String id);

}
