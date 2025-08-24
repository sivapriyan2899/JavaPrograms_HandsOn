package august24_2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateChar_String {

	public void printDuplicate(String str) {

		String[] strArray = str.split("");

		Map<String, Integer> strMap = new LinkedHashMap<String, Integer>();
		for(String s: strArray) {
			strMap.put(s, strMap.getOrDefault(s, 0)+1);
		}

		for(Map.Entry<String, Integer> entryMap: strMap.entrySet()) {
			if(!entryMap.getValue().equals(1)) {
				System.out.println(entryMap.getKey()+" - "+entryMap.getValue());
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicateChar_String dupString = new DuplicateChar_String();
		dupString.printDuplicate("siiivaav");

	}
}
