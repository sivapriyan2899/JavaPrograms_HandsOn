package august03_2025;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sivvaaa";
		String target ="v";
		String[] strArray = str.split("");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String s: strArray) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		for(Map.Entry<String, Integer> setResult : map.entrySet()) {
			if(setResult.getKey().equals(target)) {
				System.out.println("Character \""+setResult.getKey()+"\" occurred "+ setResult.getValue()+" times");
			}
		}

	}

}
