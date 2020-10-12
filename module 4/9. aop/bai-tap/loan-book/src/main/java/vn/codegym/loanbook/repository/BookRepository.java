package vn.codegym.loanbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.loanbook.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
