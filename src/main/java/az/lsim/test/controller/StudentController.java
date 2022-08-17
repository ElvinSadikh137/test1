package az.lsim.test.controller;

import az.lsim.test.model.Student;
import az.lsim.test.model.User;
import az.lsim.test.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@Slf4j
@RequiredArgsConstructor
public class StudentController {
    @Autowired
    private final StudentService studentService;

    @GetMapping("/getStudent/{id}")
    public Optional<Student> getById(@PathVariable Long id){
        return studentService.getById(id);
    }

    @GetMapping("/getStudent")
    public List<Student> getAllStudent() {
        return studentService.findAll();
    }
    @GetMapping("/get")
    public List<Student>find(){
        return studentService.find();
    }
    @PostMapping("/addStudent")
    public void addPhone(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deletePhone(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
