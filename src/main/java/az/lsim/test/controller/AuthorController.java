package az.lsim.test.controller;

import az.lsim.test.model.Author;
import az.lsim.test.model.Zipcode;
import az.lsim.test.repository.AuthorRepository;
import az.lsim.test.service.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@Slf4j
@RequiredArgsConstructor
public class AuthorController {

    @Autowired
    private final AuthorService authorService;

    @GetMapping("/getAuthor")
    public List<Author> getAllAuthor() {
        return authorService.getAll();
    }

    @PostMapping("/addAuthor")
    public void addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
    }

    @DeleteMapping("/deleteAuthor/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }

}
