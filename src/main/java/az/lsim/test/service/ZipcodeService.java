package az.lsim.test.service;

import az.lsim.test.model.Zipcode;
import az.lsim.test.repository.ZipcodeRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ZipcodeService {
    private final ZipcodeRepository zipcodeRepository;
    public void addZipcode(Zipcode zipcode){
        zipcodeRepository.save(zipcode);
    }
    public void deleteZipcode(Long id){
        zipcodeRepository.deleteById(id);
    }
//    public Page<Zipcode> findAll(Pageable pageable){
//        return zipcodeRepository.findAll(pageable);
//    }
//    public List<Zipcode> getAll(){
//        return zipcodeRepository.getAll();
//    }

    public List<Zipcode>getAll(){
        return zipcodeRepository.findAll();
    }

    public List<Zipcode>find(){
        return zipcodeRepository.findWithoutNPlusOne();
    }

}
