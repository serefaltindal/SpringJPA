package com.altindal.SpringJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.altindal.SpringJPA.entitites.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	
}
