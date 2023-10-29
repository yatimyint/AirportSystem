package system;

import java.util.HashMap;

public class AirportFlightTable {
	   public static void main(String[] args) {

	        HashMap<String, String> countryCodes = new HashMap<>();
	        countryCodes.put("Thailand", "BKK");
	        countryCodes.put("Malaysia", "KUL");
	        countryCodes.put("Singapore", "SIN");
	        countryCodes.put("Indonesia", "CGK");
	        countryCodes.put("Philippines", "MNL");
	        countryCodes.put("Burma", "RGN");
	        countryCodes.put("Belgium", "BRU");
	        countryCodes.put("Germany", "FRA");

	        // So this is like the display that shows the airport flight  with the country code etc.
	        System.out.println("Airport Flight Table");
	        System.out.println("--------------------");
	        System.out.println("Country\t\tCode");

	        for (String country : countryCodes.keySet()) {
	            String code = countryCodes.get(country);
	            System.out.println(country + "\t\t" + (String) code); // explicit casting system
	        }
	    }
	}

