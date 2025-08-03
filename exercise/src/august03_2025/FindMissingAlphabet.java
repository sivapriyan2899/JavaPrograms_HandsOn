package august03_2025;

import java.util.HashSet;
import java.util.Set;

public class FindMissingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="siva the slayer dumb knot";
		str=str.toLowerCase();
		
		Set<Character> inputSet = new HashSet<Character>() ;
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				inputSet.add(c);
			}
		}

		StringBuilder strBuilder = new StringBuilder();
		char ch;
		for(ch='a'; ch<='z';ch++) {
			if(!inputSet.contains(ch)) {
				strBuilder.append(ch);
				if(ch!='z') {
					strBuilder.append(",");
				}
			}
		}
		System.out.println("missing alphabets: "+"["+strBuilder.toString()+"]");
	}
}