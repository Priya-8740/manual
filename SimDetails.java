
package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SimDetails")
public class SimDetails {

    public static final String ACTIVE = "active";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long simId;

    private String serviceNumber;

    private String simNumber;

    private String simStatus;

    protected SimDetails() { }

    public SimDetails(String serviceNumber, String simNumber, String simStatus) {
        this.serviceNumber = serviceNumber;
        this.simNumber = simNumber;
        this.simStatus = simStatus;
    }

    public Long getSimId() { return simId; }

    public String getServiceNumber() { return serviceNumber; }

    public String getSimNumber() { return simNumber; }

    public String getSimStatus() { return simStatus; }

    public boolean isActive() {
        return ACTIVE.equalsIgnoreCase(simStatus);
    }

    public void activate() {
        this.simStatus = ACTIVE;
    }
}
