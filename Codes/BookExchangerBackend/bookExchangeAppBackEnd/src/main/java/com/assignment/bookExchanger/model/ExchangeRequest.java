package com.assignment.bookExchanger.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "exchangeRequest")
public class ExchangeRequest {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	    private UserDetails requestFrom;
	    private List<BookDetails> bookList;
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public UserDetails getRequestFrom() {
			return requestFrom;
		}
		public void setRequestFrom(UserDetails requestFrom) {
			this.requestFrom = requestFrom;
		}
		public List<BookDetails> getBookList() {
			return bookList;
		}
		public void setBookList(List<BookDetails> bookList) {
			this.bookList = bookList;
		}
		public String getRequestStatus() {
			return requestStatus;
		}
		public void setRequestStatus(String requestStatus) {
			this.requestStatus = requestStatus;
		}
		private String requestStatus;
		public ExchangeRequest(Long id, UserDetails requestFrom, List<BookDetails> bookList, String requestStatus) {
			super();
			this.id = id;
			this.requestFrom = requestFrom;
			this.bookList = bookList;
			this.requestStatus = requestStatus;
		}
		public ExchangeRequest() {
			
		}

}
