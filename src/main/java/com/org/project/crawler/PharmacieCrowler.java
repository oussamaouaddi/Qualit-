package com.org.project.crawler;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.org.project.model.Pharmacie;
import com.org.project.service.IServicePharmacie;

/*@Service*/
public class PharmacieCrowler {
	/*
	@Autowired
	IServicePharmacie servicePharmacie;

	private String url = "http://www.anahna.com/pharmacies-agadir-ca7-qa0.html";

	@PostConstruct
	public void crowler(){
		Document doc;
		try {
			doc = Jsoup.connect(url).get();
			Elements articles = doc.getElementsByTag("article");
			for (Element element : articles) {

				String nom = element.getElementsByTag("h1").text();
				String addresse = element.getElementsByTag("p").get(1).text();
				String telephone = element.getElementsByTag("p").get(2).text()
						.substring(6);
				Localisation localisation = new Localisation();
				localisation.geocoding(addresse);
				System.out.println("nom :"+nom);
				System.out.println("adresse: "+addresse);
				System.out.println("telephone"+telephone);
				System.out.println("latitude: "+localisation.getLatitude());
				System.out.println("longitude: "+localisation.getLongitude());
				Pharmacie pharmacie = new Pharmacie();
				pharmacie.setAdresse(addresse);
				pharmacie.setLatitude(localisation.getLatitude());
				pharmacie.setLongitude(localisation.getLongitude());
				pharmacie.setNom(nom);;
				pharmacie.setTelephone(telephone);
				pharmacie.setGarde(false);
				servicePharmacie.add(pharmacie);;
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}




		}
*/
	}
