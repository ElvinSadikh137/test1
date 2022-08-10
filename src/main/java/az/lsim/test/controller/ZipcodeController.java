package az.lsim.test.controller;

import az.lsim.test.model.Zipcode;
import az.lsim.test.service.ZipcodeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zipcode")
@Slf4j
@RequiredArgsConstructor
public class ZipcodeController {
    @Autowired
    private final ZipcodeService zipcodeService;

    @GetMapping("/getZipcode")
    public List<Zipcode> getAllZipcode() {
        return zipcodeService.getAll();
    }

    @PostMapping("/addZipcode")
    public void addZipcode(@RequestBody Zipcode zipcode) {
        zipcodeService.addZipcode(zipcode);
    }

    @DeleteMapping("/deleteZipcde/{id}")
    public void deleteZipcode(@PathVariable Long id) {
        zipcodeService.deleteZipcode(id);
    }

}
