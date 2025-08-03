package july29_2025;

import java.util.HashMap;
import java.util.Map;

public class Map_CountNumOfChar {

	public static void main(String[] args) {

		//declaring input
		String str = "banana";
		
		//splitting string and storing in String Array
		String[] strArray = str.split("");

		//declaring map
		Map<String, Integer> strList = new HashMap<String, Integer>();

		for(String s : strArray) {
			strList.put(s, strList.getOrDefault(s, 0)+1);
		}	
		
		for(Map.Entry<String, Integer> s : strList.entrySet()) {
			System.out.println(s.getKey()+" "+ s.getValue());
		}
	}
}
