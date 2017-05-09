package repository;

import com.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;


public interface ToDoRepository extends CrudRepository<Todo, Long> {
}
