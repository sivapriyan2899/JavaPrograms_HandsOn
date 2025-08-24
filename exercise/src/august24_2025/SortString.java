package august24_2025;

import java.util.Set;
import java.util.TreeSet;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray = {"siva", "apple", "dog", "ball" };
		Set<String> setOfString = new TreeSet<String>();
		for(String s: strArray) {
			setOfString.add(s);
		}
		
		for(String s: setOfString) {
			System.out.println(s);
		}
	}
}
