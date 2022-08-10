package az.lsim.test.repository;

import az.lsim.test.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
