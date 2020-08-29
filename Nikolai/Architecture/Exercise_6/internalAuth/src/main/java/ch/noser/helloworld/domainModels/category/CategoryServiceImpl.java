package ch.noser.helloworld.domainModels.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repo;

    @Override
    public List<Category> sortListByNameAsc() {
        List<Category> products = repo.findAll();
        products.sort(Comparator.comparing(Category::getCategoryName));
        return products;
    }

    @Override
    public List<Category> sortListByNameDesc() {
        List<Category> products = repo.findAll();
        products.sort(Comparator.comparing(Category::getCategoryName).reversed());
        return products;
    }

    @Override
    public Category getCategoryById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String updateCategoryById(String id, Category NewCategory) {
        Category category = getCategoryById(id);
        category.setCategoryName(NewCategory.getCategoryName());
        repo.save(category);
        return "Category with ID " + id + " saved!";
    }

    @Override
    public String postCategory(Category NewCategory) {
        repo.save(NewCategory);
        return "Category created!";
    }

    @Override
    public String deleteCategory(String id) {
        repo.deleteById(id);
        return "Category with ID " + id + " deleted!";
    }
}
