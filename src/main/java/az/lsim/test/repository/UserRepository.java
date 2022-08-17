package az.lsim.test.repository;

import az.lsim.test.model.Phone;
import az.lsim.test.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllBy();

    @Query("SELECT u FROM User u LEFT JOIN FETCH u.address")
    List<User> findWithoutNPlusOne();

    @EntityGraph(attributePaths = {"address.id"})
    List<User> findAll();

}
