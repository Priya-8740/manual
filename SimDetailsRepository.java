
package com.example.demo.repository;

import com.example.demo.entity.SimDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SimDetailsRepository extends JpaRepository<SimDetails, Long> {

    Optional<SimDetails> findByServiceNumberAndSimNumber(
            String serviceNumber,
            String simNumber
    );
}
