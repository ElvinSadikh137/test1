package az.lsim.test.service;

import az.lsim.test.model.Category;
import az.lsim.test.model.City;
import az.lsim.test.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public void addCity(City city){
        cityRepository.save(city);
    }
    public void deleteCity(Long id){
        cityRepository.deleteById(id);
    }

    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
