package com.assignment.bookExchanger.model;

import java.util.List;

import jakarta.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "exchange_request")
public class ExchangeRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserDetails requestFrom;

    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "exchange_request_id")
    private List<BookDetails> bookList = new ArrayList<>();
    private String requestStatus;

    // Constructors
    public ExchangeRequest() {
    }

    public ExchangeRequest(Long id, UserDetails requestFrom, List<BookDetails> bookList, String requestStatus) {
        this.id = id;
        this.requestFrom = requestFrom;
        this.bookList = bookList;
        this.requestStatus = requestStatus;
    }

    // Getters and Setters
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
}
