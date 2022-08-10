package az.lsim.test.repository;

import az.lsim.test.model.Zipcode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipcodeRepository extends JpaRepository<Zipcode,Long> {
}
