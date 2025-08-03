package july29_2025;

import java.util.HashMap;
import java.util.Map;

public class Map_FirstRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ssiivava";
		String[] strArray = str.split("");
		
		Map<String, Integer> SplitResult = new HashMap<String, Integer>();
			
		for(String addingToMap : strArray) {
			SplitResult.put(addingToMap, SplitResult.getOrDefault(addingToMap, 0)+1);
		}
		
		for(String s : strArray) {
			if(SplitResult.get(s)==1) {
				System.out.println("first non repeating char: " + s);
				return;
			}
		}
		System.out.println("No unique char");
	}
}
