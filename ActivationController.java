
package com.example.demo.controller;

import com.example.demo.entity.SimDetails;
import com.example.demo.service.SimVerificationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/activation/sim")
public class ActivationController {

    private final SimVerificationService service;

    public ActivationController(SimVerificationService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public SimDetails registerSim(
            @RequestParam String serviceNumber,
            @RequestParam String simNumber) {
        return service.registerSim(serviceNumber, simNumber);
    }

    @PostMapping("/verify")
    public SimDetails verifySim(
            @RequestParam String serviceNumber,
            @RequestParam String simNumber) {
        return service.verifySim(serviceNumber, simNumber);
    }
}
