package az.lsim.test.controller;

import az.lsim.test.model.Zipcode;
import az.lsim.test.service.ZipcodeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zipcode")
@Slf4j
@RequiredArgsConstructor
public class ZipcodeController {
    @Autowired
    private final ZipcodeService zipcodeService;

//    @GetMapping("/getZipcode")
//    public List<Zipcode> getAllZipcode() {
//        return zipcodeService.getAll();
//    }

//    @GetMapping("/n+1")
//    public Page<Zipcode> findAll(Pageable pageable){
//        return zipcodeService.findAll(pageable);
//    }


    @PostMapping("/addZipcode")
    public void addZipcode(@RequestBody Zipcode zipcode) {
        zipcodeService.addZipcode(zipcode);
    }

    @DeleteMapping("/deleteZipcde/{id}")
    public void deleteZipcode(@PathVariable Long id) {
        zipcodeService.deleteZipcode(id);
    }

    @GetMapping("get")
    public List<Zipcode>getAll(){
       return zipcodeService.getAll();
    }

    @GetMapping("/")
    public List<Zipcode>find(){
        return zipcodeService.find();
    }

}
