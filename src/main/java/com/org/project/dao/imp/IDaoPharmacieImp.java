package com.org.project.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.project.dao.IDaoPharmacie;
import com.org.project.model.Pharmacie;

@Repository
@Transactional
public class IDaoPharmacieImp implements IDaoPharmacie {
	@Autowired
	@PersistenceContext(unitName = "entityManagerFactory")
	private EntityManager emFactory;

	@Override
	public void add(Pharmacie pharmacie) {
		emFactory.persist(pharmacie);

		System.out.println(pharmacie);

	}

	@Override
	public Pharmacie delete(Pharmacie pharmacie) {
		emFactory.remove(pharmacie);

		return pharmacie;
	}

	@Override
	public Pharmacie delete(int id) {

		Pharmacie pharmacie = emFactory.find(Pharmacie.class, id);
		emFactory.remove(pharmacie);

		return pharmacie;
	}

	@Override
	public List<Pharmacie> getAllPharmacie() {
		List<Pharmacie> pharmacies;

		Query query = emFactory
				.createNativeQuery(
						"SELECT ID , ADRESSE ,LATITUDE,LONGITUDE,NOM,TELEPHONE FROM pharmacie",
						Pharmacie.class);
		pharmacies = (List<Pharmacie>) query.getResultList();

		return pharmacies;
	}

	@Override
	public Pharmacie getPharmacieByName(String nom) {
		Pharmacie pharmacie = new Pharmacie();
		Query query = emFactory.createQuery(
				"SELECT c FROM Pharmacie c WHERE c.nom = :nomPharmacie ",
				Pharmacie.class);
		query.setParameter("nomPharmacie", nom);

		pharmacie = (Pharmacie) query.getSingleResult();

		System.out.println(pharmacie);
		return pharmacie;
	}

	@Override
	public Pharmacie update(Pharmacie pharmacie) {
		emFactory.merge(pharmacie);
		return pharmacie;
	}

	

}
