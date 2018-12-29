package com.projet.projet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.projet.entities.Stagiaire;

@Service
public class StagiaireDAO {

	 @Autowired
	 StagiaireRepository stagiaireRepository;
	 
	 public List<Stagiaire> findAll(){
		 
		 return stagiaireRepository.findAll();
		 
		 
	 }
}
