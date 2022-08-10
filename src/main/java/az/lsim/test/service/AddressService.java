package az.lsim.test.service;

import az.lsim.test.model.Address;
import az.lsim.test.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;

    public List<Address> getAll(){
        return addressRepository.findAll();
    }

    public Optional<Address> getById(Long id) {
        return addressRepository.findById(id);
    }

    public void addAddress(Address address){
        addressRepository.save(address);
    }

    public void deleteAddress(Long id){
        addressRepository.deleteById(id);
    }
}
