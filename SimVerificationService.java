
package com.example.demo.service;

import com.example.demo.entity.SimDetails;
import com.example.demo.repository.SimDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class SimVerificationService {

    private final SimDetailsRepository repository;

    public SimVerificationService(SimDetailsRepository repository) {
        this.repository = repository;
    }

    public SimDetails registerSim(String serviceNumber, String simNumber) {
        SimDetails sim = new SimDetails(serviceNumber, simNumber, "inactive");
        return repository.save(sim);
    }

    public SimDetails verifySim(String serviceNumber, String simNumber) {
        return repository.findByServiceNumberAndSimNumber(serviceNumber, simNumber)
                .orElseThrow(() -> new RuntimeException("SIM details not found"));
    }
}
