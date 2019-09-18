package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		dwarfs.add(sleepy);
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		dwarfs.add(happy);
		
		Dwarf thorin = new Dwarf();
		thorin.setName("Thorin");
		thorin.setAuthor("Tolkein");
		dwarfs.add(thorin);
		
	System.out.println("The Dwarfs are:");
	
	for (Dwarf dwarf:dwarfs) {
		if (dwarf.getAuthor() == "Disney") {
		System.out.println(dwarf.getName() + " " + dwarf.getAuthor());
	}
	
	}
	System.out.println("The Tolkein Dwarfs are:");
	
	for (Dwarf dwarf:dwarfs) {
		if (dwarf.getAuthor() == "Tolkein") {
		System.out.println(dwarf.getName() + " " + dwarf.getAuthor());
	}
		
	}
	}
}

	

