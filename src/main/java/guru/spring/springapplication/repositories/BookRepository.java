package guru.spring.springapplication.repositories;

import guru.spring.springapplication.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
