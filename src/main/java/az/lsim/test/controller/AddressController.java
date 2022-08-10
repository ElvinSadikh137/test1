package az.lsim.test.controller;

import az.lsim.test.model.Address;
import az.lsim.test.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
@Slf4j
@RequiredArgsConstructor
public class AddressController {
    @Autowired
    private final AddressService addressService;

    @GetMapping("/getAddress/{id}")
    public Optional<Address> getById(@PathVariable Long id){
        return addressService.getById(id);
    }

    @GetMapping("/getAddress")
    public List<Address> getAllAddress(){
        return addressService.getAll();
    }
    @PostMapping("/addAddress")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @DeleteMapping("/deleteAddress/{id}")
    public void deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);
    }
}
