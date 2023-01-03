package com.synchrony.Synchrony.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synchrony.Synchrony.Entites.ImageEntitiy;

@Repository
public interface ImageRepo extends JpaRepository<ImageEntitiy, Long>{
		
	Optional<ImageEntitiy> findByName(String fineName);
}
