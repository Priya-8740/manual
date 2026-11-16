
package com.example.demo.repository;

import com.example.demo.entity.CustomerIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerIdentityRepository extends JpaRepository<CustomerIdentity, Long> {
    Optional<CustomerIdentity> findByServiceNumber(String serviceNumber);
}
