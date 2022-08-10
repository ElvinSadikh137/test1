package az.lsim.test.repository;

import az.lsim.test.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {
}
