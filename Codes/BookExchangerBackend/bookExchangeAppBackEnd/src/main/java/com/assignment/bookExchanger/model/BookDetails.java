package com.assignment.bookExchanger.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class BookDetails {
	
	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String author;
	    private String genre;
	    private String ownerLocation;
	    private String availability;

	    private String ownerName;

		public BookDetails(Long id, String title, String author, String genre, String ownerLocation, String availability,
				String ownerName) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
			this.genre = genre;
			this.ownerLocation = ownerLocation;
			this.availability = availability;
			this.ownerName = ownerName;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getOwnerLocation() {
			return ownerLocation;
		}

		public void setOwnerLocation(String ownerLocation) {
			this.ownerLocation = ownerLocation;
		}

		public String getAvailability() {
			return availability;
		}

		public void setAvailability(String availability) {
			this.availability = availability;
		}

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
	    
	    
	    public BookDetails() {
	    	
	    }

}
