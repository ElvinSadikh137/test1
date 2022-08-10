package az.lsim.test.service;

import az.lsim.test.model.Category;
import az.lsim.test.model.Zipcode;
import az.lsim.test.repository.ZipcodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Zipcode> getAll() {
    return zipcodeRepository.findAll();
    }
}
