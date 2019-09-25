package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@Service
public class DwarfService {

	@Autowired
	private DwarfRepository dwarfRepository;
	private static Logger logger = LoggerFactory.getLogger(dwarfsservice.class)
	//private ArrayList<Dwarf> disneyDwarfs; // Instance variables
	//private ArrayList<Dwarf> tolkienDwarfs;


	/*public ArrayList<Dwarf> getDisneyDwarfs(){

		this.disneyDwarfs = new ArrayList<Dwarf>();

		//Add dwarfs
		this.disneyDwarfs.add(new Dwarf("Sleepy", "Disney", "Sleepy.png"));
		this.disneyDwarfs.add(new Dwarf("Happy", "Disney", "Happy.png"));
		this.disneyDwarfs.add(new Dwarf("Bashful", "Disney", "Bashful.png"));
		this.disneyDwarfs.add(new Dwarf("Dopey", "Disney", "Dopey.png"));
		this.disneyDwarfs.add(new Dwarf("Doc", "Disney", "Doc.png"));
		this.disneyDwarfs.add(new Dwarf("Grumpy", "Disney", "Grumpy.png"));
		this.disneyDwarfs.add(new Dwarf("Sneezy", "Disney", "Sneezy.png"));

		return this.disneyDwarfs;

	}
	public ArrayList<Dwarf> getTolkienDwarfs(){

		this.tolkienDwarfs = new ArrayList<Dwarf>();
		
		//Add dwarfs
				this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
				this.tolkienDwarfs.add(new Dwarf("Balin", "Tolkien", "Balin.png"));
				this.tolkienDwarfs.add(new Dwarf("Dwalin", "Tolkien", "Dwalin.png"));
				this.tolkienDwarfs.add(new Dwarf("Fili", "Tolkien", "Fili.png"));
				this.tolkienDwarfs.add(new Dwarf("Kili", "Tolkien", "Kili.png"));
				this.tolkienDwarfs.add(new Dwarf("Dori", "Tolkien", "Dori.png"));
				this.tolkienDwarfs.add(new Dwarf("Nori", "Tolkien", "Nori.png"));
				


		return this.tolkienDwarfs;

	}


}