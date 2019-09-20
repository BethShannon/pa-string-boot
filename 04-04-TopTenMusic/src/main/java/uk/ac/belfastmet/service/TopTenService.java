package uk.ac.belfastmet.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.domain.TopTen;


@Service
public class TopTenService {

	private ArrayList<TopTen> artistTopTen; // Instance variables
	private ArrayList<TopTen> albumTopTen;

	public ArrayList<TopTen> getArtistTopTen(){
		
	this.artistTopTen = new ArrayList<TopTen>();
	
	this.artistTopTen.add(new TopTen("One", "Artist1", "Artist1.png"));
	this.artistTopTen.add(new TopTen("Two", "Artist2", "Artist2.png"));
	this.artistTopTen.add(new TopTen("Three", "Artist3", "Artist3.png"));
	this.artistTopTen.add(new TopTen("Four", "Artist4", "Artist4.png"));
	this.artistTopTen.add(new TopTen("Five", "Artist5", "Artist5.png"));
	this.artistTopTen.add(new TopTen("Six", "Artist6", "Artist6.png"));
	this.artistTopTen.add(new TopTen("Seven", "Artist7", "Artist7.png"));
	this.artistTopTen.add(new TopTen("Eight", "Artist8", "Artist8.png"));

	return this.artistTopTen;


	}
	
	public ArrayList<TopTen> getAlbumTopTen(){
		
		this.albumTopTen = new ArrayList<TopTen>();
		
		this.albumTopTen.add(new TopTen("One", "Album1", "Album1.png"));
		this.albumTopTen.add(new TopTen("Two", "Album2", "Album2.png"));
		this.albumTopTen.add(new TopTen("Three", "Album4", "Album4.png"));
		this.albumTopTen.add(new TopTen("Four", "Album5", "Album5.png"));
		this.albumTopTen.add(new TopTen("Five", "Album6", "Album6.png"));
		this.albumTopTen.add(new TopTen("Six", "Album7", "Album7.png"));
		this.albumTopTen.add(new TopTen("Seven", "Album8", "Album8.png"));
		this.albumTopTen.add(new TopTen("Eight", "Album9", "Album9.png"));

		return this.albumTopTen;

		
}
}