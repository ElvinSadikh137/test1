package az.lsim.test.repository;

import az.lsim.test.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {

}
