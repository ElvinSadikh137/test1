package az.lsim.test.controller;

import az.lsim.test.model.City;
import az.lsim.test.service.CityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@Slf4j
@RequiredArgsConstructor
public class CityController {
    @Autowired
    private final CityService cityService;

    @GetMapping("/getCity")
    public List<City> getAllCity() {
        return cityService.getAll();
    }

    @PostMapping("/addCity")
    public void addCity(@RequestBody City city) {
        cityService.addCity(city);
    }

    @DeleteMapping("/deleteCity/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityService.deleteCity(id);
    }

}
