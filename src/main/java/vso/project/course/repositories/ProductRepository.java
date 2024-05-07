package vso.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vso.project.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
