package az.lsim.test.service;

import az.lsim.test.model.Author;
import az.lsim.test.model.Zipcode;
import az.lsim.test.repository.AuthorRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public void addAuthor(Author author){
        authorRepository.save(author);
    }

    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }

    public List<Author>getAll(){
        return authorRepository.findAll();
    }



}
