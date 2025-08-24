package august24_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="siva", str2="ival";
		String[] str1Array = str1.split("");
		String[] str2Array = str2.split("");
		List<String> listStr1 = new ArrayList<String>();
		List<String> listStr2 = new ArrayList<String>();
		
		for(String s: str1Array) {
			listStr1.add(s);
		}
		for(String s: str2Array) {
			listStr2.add(s);
		}
		
		Collections.sort(listStr1);
		Collections.sort(listStr2);
		
		if(listStr1.equals(listStr2)) {
			System.out.println("given input is anagram");
		}else
			System.out.println("not an anagram");
	}

}
