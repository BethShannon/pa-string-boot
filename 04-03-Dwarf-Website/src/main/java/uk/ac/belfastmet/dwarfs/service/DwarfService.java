package uk.ac.belfastmet.dwarfs.service;


//kevin - indentation, you can use shortcut Ctrl l

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import java.util.Iterator;
/**
 * The class provides services
 * @author SHA19171902
 *
 */
@Service
public class DwarfService {
	/**
	 * eliminates the need for getters and setters
	 */
	//kevin - DwarfRepository doesn't exist
	@Autowired
	private DwarfRepository dwarfRepository;
	//kevin - dwarfsservice doesn't exist
	private static Logger logger = LoggerFactory.getLogger(dwarfsservice.class)

			/**
			 * Count returns the amount of entities available
			 * @return
			 */
			public Iterable<Dwarf> getDisneyDwarfs(){
		logger.info("# of disney dwarfs: {}", dwarfRepository.count());
		/**
		 * findAll() Returns all instances of the type
		 * for-each loop through disney dwarfs
		 */
		Iterable <Dwarf> disney = dwarfRepository.findAll();
		Iterator <Dwarf> iterator = disney.iterator();



	}

}