package guru.spring.springapplication.repositories;

import guru.spring.springapplication.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
