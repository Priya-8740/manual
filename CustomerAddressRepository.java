
package com.example.demo.repository;

import com.example.demo.entity.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Long> {
    Optional<CustomerAddress> findByServiceNumber(String serviceNumber);
}
