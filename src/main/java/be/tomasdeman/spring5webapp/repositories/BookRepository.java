package be.tomasdeman.spring5webapp.repositories;

import be.tomasdeman.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>
{

}
