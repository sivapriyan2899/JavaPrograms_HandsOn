package august02_2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VowelsCount_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="jooon";
		String finalStr = str.toLowerCase();
		String[] strArray = finalStr.split("");
		
		Set<String> vowels = Set.of("a","e","i","o","u"); //pudhu vishiyam
		
		HashMap<String, Integer> strMap = new HashMap<String, Integer>();
		
		for(String s : strArray) {
			if(vowels.contains(s)) {
				strMap.put(s, strMap.getOrDefault(s, 0)+1);
			}
		}
		
		for(Map.Entry<String, Integer> setResult : strMap.entrySet()) {
			System.out.println("character \'" +setResult.getKey()+"\' occurred "+setResult.getValue()+" times");
		}
	}

}
