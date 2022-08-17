package az.lsim.test.controller;


import az.lsim.test.model.Book;
import az.lsim.test.model.Phone;
import az.lsim.test.service.PhoneService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/phone")
@Slf4j
@RequiredArgsConstructor
public class PhoneController {
    @Autowired
    private final PhoneService phoneService;

    @GetMapping("/getPhone/{id}")
    public Optional<Phone> getById(@PathVariable Long id){
        return phoneService.getById(id);
    }

    @GetMapping("/getPhone")
    public List<Phone> getAllPhone() {
        return phoneService.findAll();
    }
    @GetMapping("/get")
    public List<Phone>find(){
        return phoneService.find();
    }
    @PostMapping("/addPhone")
    public void addPhone(@RequestBody Phone phone){
        phoneService.addPhone(phone);
    }

    @DeleteMapping("/deletePhone/{id}")
    public void deletePhone(@PathVariable Long id){
        phoneService.deletePhone(id);
    }
}

