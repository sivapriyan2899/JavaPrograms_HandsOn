package august02_2025;

public class LastWordLength_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="good morning da siva";
		
		String[] strArray = str.split(" ");
		
		int lenthOfArray = strArray.length;
		
		System.out.println("The length of last word \'"+strArray[lenthOfArray-1] +"\' is " +strArray[lenthOfArray-1].length());

	}
}

//code complied in 0ms and beats 100% in leetcode