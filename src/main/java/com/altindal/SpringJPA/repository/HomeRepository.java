package com.altindal.SpringJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altindal.SpringJPA.entitites.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long>{

}
