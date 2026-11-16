package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SimOffers")
public class SimOffers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;

    private int callQty;

    private int cost;

    private int dataQty;

    private int duration;

    private String offerName;

    @ManyToOne(optional = false)
    @JoinColumn(name = "simId")
    private SimDetails sim;
}