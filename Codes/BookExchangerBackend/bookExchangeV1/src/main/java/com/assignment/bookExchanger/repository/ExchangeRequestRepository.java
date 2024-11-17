package com.assignment.bookExchanger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.bookExchanger.model.ExchangeRequest;

public interface ExchangeRequestRepository extends JpaRepository<ExchangeRequest , Long>{


}
