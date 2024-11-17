package com.assignment.bookExchanger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.bookExchanger.model.BookDetails;
import com.assignment.bookExchanger.model.ExchangeRequest;
import com.assignment.bookExchanger.model.UserDetails;
import com.assignment.bookExchanger.repository.BookDetailsRepository;
import com.assignment.bookExchanger.repository.ExchangeRequestRepository;
import com.assignment.bookExchanger.repository.UserRepository;
//import com.assignment.bookExchanger.service.UserDetailsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/bookExchanger/")
public class BookExchangerController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookDetailsRepository bookDetailsRepository;
	
	@Autowired
	private ExchangeRequestRepository exchangeRequestRepository;
	
//	@Autowired
//    private UserDetailsService userService;

	
	@GetMapping("/userDetails")
	public List<UserDetails> getUserDetails(){
		return userRepository.findAll();
	}
	
	 @PostMapping("/bookDetails/add")
	    public BookDetails addBook(@RequestBody BookDetails book) {
	        return bookDetailsRepository.save(book);
	    }
	 
	 @GetMapping("/getBookDetails/")
	    public List<BookDetails> getBooks(@RequestParam(required = false) String search) {
	        if (search != null) {
	            return bookDetailsRepository.findByTitleContaining(search);
	        }
	        return bookDetailsRepository.findAll();
	    }
	 @PostMapping("/exchange")
	 public ExchangeRequest createExchangeRequest(@RequestBody ExchangeRequest exchangeRequest) {
	     List<BookDetails> managedBooks = exchangeRequest.getBookList().stream()
	         .map(book -> bookDetailsRepository.findById(book.getId()).orElseThrow(() -> new RuntimeException("Book not found")))
	         .toList();
	     exchangeRequest.setBookList(managedBooks);
	     return exchangeRequestRepository.save(exchangeRequest);

	 }
	 
}
