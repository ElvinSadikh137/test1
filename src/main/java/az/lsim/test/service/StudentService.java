package az.lsim.test.service;

import az.lsim.test.model.Address;
import az.lsim.test.model.Student;
import az.lsim.test.repository.AddressRepository;
import az.lsim.test.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Optional<Student> getById(Long id) {
        return studentRepository.findById(id);
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

}
