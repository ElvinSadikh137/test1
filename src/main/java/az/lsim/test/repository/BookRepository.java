package az.lsim.test.repository;

import az.lsim.test.model.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    List<Book> findAllBy();

    @Query("SELECT b FROM Book b LEFT JOIN FETCH b.category")
    List<Book> findWithoutNPlusOne();

    @EntityGraph(attributePaths = {"category.id"})
    List<Book> findAll();
}
