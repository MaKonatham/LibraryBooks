package com.galvanize.tmo.paspringstarter.Util;

import com.galvanize.tmo.paspringstarter.Model.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
