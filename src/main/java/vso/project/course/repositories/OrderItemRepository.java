package vso.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vso.project.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
