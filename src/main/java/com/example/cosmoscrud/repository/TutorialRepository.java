package com.example.cosmoscrud.repository;

import com.example.cosmoscrud.model.Tutorial;


import java.util.List;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends CosmosRepository<Tutorial, Long>{
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);
}
