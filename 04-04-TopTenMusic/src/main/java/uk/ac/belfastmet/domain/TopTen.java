package uk.ac.belfastmet.domain;

public class TopTen {


	//Instance Variables 
		private String number;
		private String artist;
		private String image;
		
	//Constructors
		public TopTen() {
			super();
		}
		
		public TopTen(String number, String artist, String image) {
			super();
			this.number = number;
			this.artist = artist;
			this.image = image;
		}

	

		public String getNumber() {
			return number;
		}
		
		public void setNumber(String number) {
			this.number = number;
		}
		
		public String getArtist() {
			return artist;
		}
		
		public void setArtist(String artist) {
			this.artist = artist;
		}
		
		public String getImage() {
			return image;
		}
		
		public void setImage(String image) {
			this.image = image;
		}
		
		public String toString() {
			return number + artist;
		}
}


