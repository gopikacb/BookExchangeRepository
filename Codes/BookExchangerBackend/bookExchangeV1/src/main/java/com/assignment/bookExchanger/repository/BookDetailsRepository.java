package com.assignment.bookExchanger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.bookExchanger.model.BookDetails;


public interface BookDetailsRepository extends JpaRepository<BookDetails , Long>{

	List<BookDetails> findByTitleContaining(String search);

}
