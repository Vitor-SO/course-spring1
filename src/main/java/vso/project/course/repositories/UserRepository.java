package vso.project.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vso.project.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
