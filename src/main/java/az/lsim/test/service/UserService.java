package az.lsim.test.service;

import az.lsim.test.model.User;
import az.lsim.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
