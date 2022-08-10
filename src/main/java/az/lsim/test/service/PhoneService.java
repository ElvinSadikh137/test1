package az.lsim.test.service;

import az.lsim.test.model.Phone;
import az.lsim.test.model.Student;
import az.lsim.test.repository.PhoneRepository;
import az.lsim.test.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PhoneService {
    private final PhoneRepository phoneRepository;

    public List<Phone> getAll(){
        return phoneRepository.findAll();
    }

    public Optional<Phone> getById(Long id) {
        return phoneRepository.findById(id);
    }

    public void addPhone(Phone phone){
        phoneRepository.save(phone);
    }

    public void deletePhone(Long id){
        phoneRepository.deleteById(id);
    }

}
