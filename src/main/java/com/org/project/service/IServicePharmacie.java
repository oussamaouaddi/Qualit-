package com.org.project.service;

import java.util.List;
import com.org.project.model.Pharmacie;

public interface IServicePharmacie {
	public void add (Pharmacie pharmacie);
	 public Pharmacie delete(Pharmacie pharmacie);
	 public Pharmacie delete(int id);
	 public Pharmacie update(Pharmacie pharmacie);
	 public Pharmacie getPharmacieByName(String nom);
	 public List<Pharmacie> getAllPharmacie();
	

}
