package guru.spring.springapplication.repositories;

import guru.spring.springapplication.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
