package az.lsim.test.controller;

import az.lsim.test.model.Book;
import az.lsim.test.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@Slf4j
@RequiredArgsConstructor
public class BookController {

    @Autowired
    private final BookService bookService;

    @GetMapping("/getBook")
    public List<Book> getAllBook() {
        return bookService.getAll();
    }

    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

}
