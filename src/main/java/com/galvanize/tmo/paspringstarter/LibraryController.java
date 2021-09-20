package com.galvanize.tmo.paspringstarter;

import com.galvanize.tmo.paspringstarter.Dao.Memorable;
import com.galvanize.tmo.paspringstarter.Model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    private final Memorable<Book> dao;

    public LibraryController(Memorable<Book> dao) {
        this.dao = dao;
    }

    @GetMapping("/health")
    public HttpStatus health() {
        return HttpStatus.OK;
    }

    @PostMapping("/api/books")
    public Book addBook(@RequestBody Book newBook) {
        dao.save(newBook);
        return newBook;

    }

    @GetMapping("/api/books")
    public List<Book> getAllBooks() {
        return dao.findAll();
    }

    @DeleteMapping("/api/books")
    public HttpStatus deleteAllBooks() {
        dao.deleteAll();
        return HttpStatus.NO_CONTENT;
    }
}
