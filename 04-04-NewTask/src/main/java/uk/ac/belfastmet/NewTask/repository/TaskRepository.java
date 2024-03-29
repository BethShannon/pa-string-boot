package uk.ac.belfastmet.NewTask.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.ac.belfastmet.NewTask.domain.Task;

@Repository
/**
 * Create, replace, update, delete
 * Handles all SQL queries
 * @author SHA19171902
 *
 */
public interface TaskRepository extends CrudRepository<Task, Long>{

}
