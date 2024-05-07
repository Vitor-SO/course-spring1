package vso.project.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vso.project.course.entities.Product;
import vso.project.course.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService ProductService;
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> ProductList = ProductService.findAll();

        return ResponseEntity.ok().body(ProductList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product Product = ProductService.findById(id);
        return ResponseEntity.ok().body(Product);
    }
}
