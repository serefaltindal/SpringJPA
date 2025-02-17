package com.altindal.SpringJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altindal.SpringJPA.entitites.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
