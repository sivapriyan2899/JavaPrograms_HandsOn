package august24_2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="sivaaaaei";
		str = str.toLowerCase();
		char[] charArray=str.toCharArray();
		//String[] strArray = str.split("");
	
		Set<Character> vowelSet = Set.of('a','e','i','o','u');
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c: charArray) {
			if(vowelSet.contains(c)) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entrysetResult : map.entrySet()) {
			System.out.println(entrysetResult.getKey()+" - "+ entrysetResult.getValue());
			//System.out.println();
		}	

	}

}
