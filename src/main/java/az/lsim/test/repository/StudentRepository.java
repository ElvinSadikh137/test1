package az.lsim.test.repository;

import az.lsim.test.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
