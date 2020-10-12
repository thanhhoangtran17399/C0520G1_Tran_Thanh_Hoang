package vn.codegym.loanbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.loanbook.model.Book;
import vn.codegym.loanbook.repository.BookRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookServiceImpl implements BookService {
    public static Map<Long, Book> bookMap = new HashMap<>();
    @Autowired
    BookRepository bookRepository;

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public boolean rentBook(Book book) {
        for (Book temp : bookRepository.findAll()) {
            bookMap.put(temp.getId(), temp);
        }
        if (bookMap == null) {
            throw new NullPointerException();
        } else {
            Book temp = bookMap.get(book.getId());
            if (temp.getAmount() == 0) {
                return false;
            } else {
                temp.setAmount(temp.getAmount() - 1);
                bookRepository.save(temp);
                return true;
            }
        }
    }

    @Override
    public void payBook(Book book) {
        Book temp = bookMap.get(book.getId());
        if (temp != null) {
            temp.setAmount(temp.getAmount() + 1);
            bookRepository.save(temp);
        }
    }

}
