package az.lsim.test.repository;

import az.lsim.test.model.Phone;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone,Long> {

    List<Phone> findAllBy();

    @Query("SELECT p FROM Phone p LEFT JOIN FETCH p.student")
    List<Phone> findWithoutNPlusOne();

    @EntityGraph(attributePaths = {"student.id"})
    List<Phone> findAll();
}
