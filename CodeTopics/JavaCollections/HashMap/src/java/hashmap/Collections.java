package java.hashmap;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		//Hash maps contain both sets and lists
		// Or key values and pairs
		
		HashMap<String, String> clipart = new HashMap<>();
		
		           //key value 		pair
		clipart.put("People", "StickFigures");
		clipart.put("Holliday", "Christmas");
		clipart.put("Sports", "Celebrations");
		clipart.put("School", "Supplies");
		clipart.put("Buildings", "EiffelTower");
		
		Set<String> CSet = clipart.keySet();
		for(String s: CSet) {System.out.println("[" + s + "]");}
		
	}

}
