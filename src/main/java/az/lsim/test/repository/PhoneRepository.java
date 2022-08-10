package az.lsim.test.repository;

import az.lsim.test.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone,Long> {
}
