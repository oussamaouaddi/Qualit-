package com.org.project.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.org.project.model.Pharmacie;

public interface IDaoPharmacie {

	 public void add (Pharmacie pharmacie);
	 public Pharmacie delete(Pharmacie pharmacie);
	 public Pharmacie delete(int id);
	 public Pharmacie update( Pharmacie pharmacie);
	 public Pharmacie getPharmacieByName(String nom);
	 public List<Pharmacie> getAllPharmacie();
	

}
