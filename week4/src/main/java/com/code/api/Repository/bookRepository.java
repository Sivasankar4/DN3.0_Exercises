package main.java.com.code.api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.api.entity.Book;
@Repository
public interface bookRepository extends JpaRepository<Book, Integer> {

	 Optional<Book> findByIsbn(String isbn);
}


