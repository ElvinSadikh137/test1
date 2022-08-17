package az.lsim.test.repository;

import az.lsim.test.model.Student;
import az.lsim.test.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findAllBy();

    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.phone")
    List<Student> findWithoutNPlusOne();

    @EntityGraph(attributePaths = {"phone.id"})
    List<Student> findAll();
}
