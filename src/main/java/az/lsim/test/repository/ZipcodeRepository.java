package az.lsim.test.repository;

import az.lsim.test.model.Zipcode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {
//    @Override
//    @EntityGraph(attributePaths = {"city.id"})
//    Page<Zipcode> findAll(Pageable pageable);
//    @Query(value = "SELECT * from zipcode inner join city on (zipcode.id=city.id)",nativeQuery = true)
//    List<Zipcode>getAll();

    List<Zipcode> findAllBy();

    @Query("SELECT z FROM Zipcode z LEFT JOIN FETCH z.city")
    List<Zipcode> findWithoutNPlusOne();

    @EntityGraph(attributePaths = {"city.id"})
    List<Zipcode> findAll();



}
