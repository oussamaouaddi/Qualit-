package com.org.project.crawler;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;



import org.json.JSONObject;


public class Localisation {
	private double latitude;
	private double longitude;

	public void geocoding(String addr) throws Exception {
		// build a URL
		String s = "http://maps.google.com/maps/api/geocode/json?"
				+ "sensor=false&address=";
		s += URLEncoder.encode(addr, "UTF-8");
		URL url = new URL(s);

		// read from the URL
		Scanner scan = new Scanner(url.openStream());
		String str = new String();
		while (scan.hasNext())
			str += scan.nextLine();
		scan.close();

		// build a JSON object
		JSONObject obj = new JSONObject(str);
		if (!obj.getString("status").equals("OK"))
			return;

		// get the first result
		JSONObject res = obj.getJSONArray("results").getJSONObject(0);
		System.out.println(res.getString("formatted_address"));
		JSONObject loc = res.getJSONObject("geometry")
				.getJSONObject("location");
		latitude = loc.getDouble("lat");
		longitude = loc.getDouble("lng");
		System.out.println("lat: " + loc.getDouble("lat") + ", lng: "
				+ loc.getDouble("lng"));
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
}
