package august24_2025;

import java.util.HashMap;
import java.util.Map;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "siva is siva but jon is not is siva";
		String[] splitResult = str.split(" ");
		
		Map<String, Integer> stringMap = new HashMap<String, Integer>();
		for(String s : splitResult) {
			stringMap.put(s, stringMap.getOrDefault(s, 0)+1);
		}
		
		for(Map.Entry<String, Integer> stringEntryMap : stringMap.entrySet()) {
			System.out.println(stringEntryMap.getKey()+" - "+stringEntryMap.getValue());
		}
		
	}

}
