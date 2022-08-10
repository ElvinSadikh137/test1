package az.lsim.test.repository;

import az.lsim.test.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
