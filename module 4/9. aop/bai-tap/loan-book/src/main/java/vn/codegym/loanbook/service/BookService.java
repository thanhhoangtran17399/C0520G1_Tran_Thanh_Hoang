package vn.codegym.loanbook.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.loanbook.model.Book;

import java.util.List;

public interface BookService  {
    void save(Book book);
    List<Book> getAll();
    public Book findById(int id);
    public void update(Book book);
    public Page<Book> findAll(Pageable pageable);


    boolean rentBook(Book book);
    void payBook(Book book);
}
