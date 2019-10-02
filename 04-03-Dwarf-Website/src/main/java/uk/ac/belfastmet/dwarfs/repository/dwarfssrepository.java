package uk.ac.belfastmet.dwarfs.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.ac.belfastmet.dwarfs.domain.Dwarf;



@Repository
/**
 * Create, replace, update, delete
 * Handles all SQL queries
 * @author SHA19171902
 *
 */
// kevin - all classes must start with a capital
public interface dwarfssrepository  extends CrudRepository<Dwarf, Long>{
}
