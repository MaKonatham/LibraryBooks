package com.galvanize.tmo.paspringstarter;

import com.galvanize.tmo.paspringstarter.Dao.Memorable;
import com.galvanize.tmo.paspringstarter.Model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity addBook(@RequestBody Book newBook) {
        dao.save(newBook);
        return ResponseEntity.status(HttpStatus.CREATED).body(newBook);

    }

    @GetMapping("/api/books")
    public ResponseEntity getAllBooks() {

        List<Book> booksList = dao.findAll();
        Collections.sort(booksList, new com.galvanize.tmo.paspringstarter.Util.BookComparator());
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("books", booksList));
    }

    @DeleteMapping("/api/books")
    public ResponseEntity deleteAllBooks() {
        dao.deleteAll();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
    }
}
