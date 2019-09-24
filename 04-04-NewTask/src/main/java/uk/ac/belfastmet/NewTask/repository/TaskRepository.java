package uk.ac.belfastmet.NewTask.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.ac.belfastmet.NewTask.domain.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

}
