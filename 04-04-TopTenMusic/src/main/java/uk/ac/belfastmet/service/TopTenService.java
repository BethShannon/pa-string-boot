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

		this.artistTopTen.add(new TopTen("1", "Artist1", "Artist1.png"));
		this.artistTopTen.add(new TopTen("2", "Artist2", "Artist2.png"));
		this.artistTopTen.add(new TopTen("3", "Artist3", "Artist3.png"));
		this.artistTopTen.add(new TopTen("4", "Artist4", "Artist4.png"));
		this.artistTopTen.add(new TopTen("5", "Artist5", "Artist5.png"));
		this.artistTopTen.add(new TopTen("6", "Artist6", "Artist6.png"));
		this.artistTopTen.add(new TopTen("7", "Artist7", "Artist7.png"));
		this.artistTopTen.add(new TopTen("8", "Artist8", "Artist8.png"));
		this.artistTopTen.add(new TopTen("9", "Artist9", "Artist9.png"));
		this.artistTopTen.add(new TopTen("10", "Artist10", "Artist10.png"));

		return this.artistTopTen;


	}

	public ArrayList<TopTen> getAlbumTopTen(){

		this.albumTopTen = new ArrayList<TopTen>();

		this.albumTopTen.add(new TopTen("1", "Album1", "Album1.png"));
		this.albumTopTen.add(new TopTen("2", "Album2", "Album2.png"));
		this.albumTopTen.add(new TopTen("3", "Album4", "Album4.png"));
		this.albumTopTen.add(new TopTen("4", "Album5", "Album5.png"));
		this.albumTopTen.add(new TopTen("5", "Album6", "Album6.png"));
		this.albumTopTen.add(new TopTen("6", "Album7", "Album7.png"));
		this.albumTopTen.add(new TopTen("7", "Album8", "Album8.png"));
		this.albumTopTen.add(new TopTen("8", "Album9", "Album9.png"));
		this.albumTopTen.add(new TopTen("9", "Album9", "Album9.png"));
		this.albumTopTen.add(new TopTen("10", "Album10", "Album10.png"));

		
		return this.albumTopTen;


	}
}