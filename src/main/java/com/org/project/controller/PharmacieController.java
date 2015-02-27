package com.org.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.project.model.Pharmacie;
import com.org.project.service.IServicePharmacie;

@Controller
public class PharmacieController {
	@Autowired
	IServicePharmacie servicePharmacie;

	@RequestMapping(value = "/indexPharmacie", method = RequestMethod.GET)
	public String listPharmacie(Model model) {

		model.addAttribute("pharmacie", new Pharmacie());
		model.addAttribute("pharmacies", servicePharmacie.getAllPharmacie());
		model.addAttribute("welcome", "Bonjour1");
  servicePharmacie.getPharmacieByName("La Génération de Pharmacie et de Chimie (Gephac)");
		return "Pharmacie";
	}

	@RequestMapping(value = "/ajoutPharmacie", method = RequestMethod.GET)
	public String ajouterPharmacie(Model model) {

		model.addAttribute("pharmacie", new Pharmacie());
		model.addAttribute("welcome", "Bonjour1");

		return "AjouterPharmacie";
	}

	@RequestMapping(value = "/savePharmacie")
	public String savePharmacie(Pharmacie pharmacie, Model model) {

		servicePharmacie.add(pharmacie);
		model.addAttribute("pharmacies", servicePharmacie.getAllPharmacie());
		model.addAttribute("welcome", "Bonjour");

		return "Pharmacie";
	}

}
