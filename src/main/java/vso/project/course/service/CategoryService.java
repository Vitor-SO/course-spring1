package vso.project.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vso.project.course.entities.Category;
import vso.project.course.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = CategoryRepository.findById(id);
        return obj.get();
    }
}