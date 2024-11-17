package com.assignment.bookExchanger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.bookExchanger.model.UserDetails;


public interface UserRepository extends JpaRepository<UserDetails , String> {

	
}
