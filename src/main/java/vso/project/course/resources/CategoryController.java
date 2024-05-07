package vso.project.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vso.project.course.entities.Category;
import vso.project.course.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService CategoryService;
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> CategoryList = CategoryService.findAll();

        return ResponseEntity.ok().body(CategoryList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category Category = CategoryService.findById(id);
        return ResponseEntity.ok().body(Category);
    }
}
