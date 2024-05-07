package vso.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vso.project.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
