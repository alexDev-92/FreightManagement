package edu.depaul.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoadRepository extends JpaRepository<Load, Long>{


	
}
