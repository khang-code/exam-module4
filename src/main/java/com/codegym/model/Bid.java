package com.codegym.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @ManyToOne
    private User bidder;

    @ManyToOne
    private Item item;

    private LocalDateTime bidTime;

    // Constructors, Getters, and Setters
}

