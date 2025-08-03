package august02_2025;

import java.util.HashMap;
import java.util.Map;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "siivaaae";
		String[] strArray= str.split("");
		
		HashMap<String, Integer> strMap = new HashMap<String, Integer>();
		
		for(String s : strArray) {
			String sl = s.toLowerCase();
			if(sl.equals("a") || sl.equals("e") || sl.equals("i") || sl.equals("o") || sl.equals("u")) {
				strMap.put(sl, strMap.getOrDefault(s, 0)+1);
			}
		}
		for(Map.Entry<String, Integer> setResult : strMap.entrySet()) {
			System.out.println(setResult.getKey() +" - "+setResult.getValue());
		}
	}
}
