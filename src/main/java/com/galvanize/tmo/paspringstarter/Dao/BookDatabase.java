package com.galvanize.tmo.paspringstarter.Dao;

import com.galvanize.tmo.paspringstarter.Model.Book;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookDatabase implements Memorable {
    private List<Book> list;
    private Long autoIncrement;

    public BookDatabase() {
        this.autoIncrement = 0L;
        this.list = new ArrayList<>();
        /*this.list.add(new Book(1L, "Philip K. Dick", "Do Androids Dream of Electric Sheep?", "1968"));
        this.autoIncrement++;*/
        this.list.add(new Book(this.autoIncrement, "William Gibson", "Neuromancer", 1984));
        this.autoIncrement++;
        this.list.add(new Book(this.autoIncrement, "Douglas Adams", "A Hitchhiker's Guide to the Galaxy", 1979));
        this.autoIncrement++;
    }

    @Override
    public List findAll() {
        return this.list;
    }

    @Override
    public void save(Object obj) {
        Book book = (Book) obj;
        if(book.getId() == null) {
            this.autoIncrement++;
            book.setId(this.autoIncrement);
            this.list.add(book);
        }
    }

    @Override
    public void deleteAll() {
        this.list.removeAll(list);
    }
}
