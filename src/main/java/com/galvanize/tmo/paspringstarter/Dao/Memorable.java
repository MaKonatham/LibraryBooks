package com.galvanize.tmo.paspringstarter.Dao;
import java.util.List;

public interface Memorable<E> {
    List<E> findAll();

    void save(E e);

    void deleteAll();
}
