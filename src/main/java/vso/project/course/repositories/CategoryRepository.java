package vso.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vso.project.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
