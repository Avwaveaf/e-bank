package com.avwaveaf.accounts.repository;

import com.avwaveaf.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,  Long> {
}
