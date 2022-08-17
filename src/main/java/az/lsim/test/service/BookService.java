package az.lsim.test.service;

import az.lsim.test.model.Author;
import az.lsim.test.model.Book;
import az.lsim.test.model.Zipcode;
import az.lsim.test.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void addBook(Book book){
        bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public List<Book> getAll() {
    return bookRepository.findAll();
    }

    public List<Book>find(){
        return bookRepository.findWithoutNPlusOne();
    }
}
