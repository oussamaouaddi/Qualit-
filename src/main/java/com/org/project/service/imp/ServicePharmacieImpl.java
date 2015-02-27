package com.org.project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;

import com.org.project.dao.IDaoPharmacie;
import com.org.project.model.Pharmacie;
import com.org.project.service.IServicePharmacie;

public class ServicePharmacieImpl implements IServicePharmacie {
	@Autowired
	private IDaoPharmacie daoPharmacie;

	@Override
	public void add(Pharmacie pharmacie) {
		daoPharmacie.add(pharmacie);
		
	}

	@Override
	public Pharmacie delete(Pharmacie pharmacie) {
		
		return daoPharmacie.delete(pharmacie);
	}

	@Override
	public Pharmacie delete(int id) {
	
		return daoPharmacie.delete(id);
	}

	
	@Override
	public List<Pharmacie> getAllPharmacie() {
		
		return daoPharmacie.getAllPharmacie( );
	}

	@Override
	public  Pharmacie getPharmacieByName(String nom) {
		
		return daoPharmacie.getPharmacieByName(nom);
	}

	@Override
	public Pharmacie update(Pharmacie pharmacie) {
		
		return daoPharmacie.update(pharmacie);
	}

	

	
}
