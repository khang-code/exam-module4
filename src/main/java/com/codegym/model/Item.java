package com.codegym.model;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double startingPrice;

    @ManyToOne
    private User seller;

    // Constructors, Getters, and Setters
}

