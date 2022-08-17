package az.lsim.test.repository;

import az.lsim.test.model.Author;
import az.lsim.test.model.Zipcode;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Long> {
    List<Author> findAllBy();

    @Query("SELECT a FROM Author a LEFT JOIN FETCH a.zipcode")
    List<Author> findWithoutNPlusOne();

    @EntityGraph(attributePaths = {"zipcode.id"})
    List<Author> findAll();

}
