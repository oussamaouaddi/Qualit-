package com.org.project;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.org.project.model.Pharmacie;

public class Test {
public static void main(String[] args){
	String url = "http://www.laboelallali.com/Pharmacie-de-garde.html";
	try {
		Document document = Jsoup.connect(url).get();

		Element sectionElements = document.getElementsByClass("itemList")
				.first();

		Elements childElements = sectionElements
				.getElementsByClass("catItemView");

		for (Element pharmarcieModel : childElements) {
			Pharmacie pharmacie = new Pharmacie();

			String nom = pharmarcieModel.getElementsByTag("h3")
					.first().text();
			
			System.out.println(nom);

		}

	} catch (IOException e) {
		System.out.println("IOException in Job: " + e);
	}

}

}
