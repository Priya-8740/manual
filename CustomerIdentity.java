
package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CustomerIdentity")
public class CustomerIdentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identityId;

    private String serviceNumber;
    private String identityType;
    private String identityNumber;

    public CustomerIdentity() {
    }

    public Long getIdentityId() {
        return identityId;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
