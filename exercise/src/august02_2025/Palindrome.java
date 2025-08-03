package august02_2025;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 121;
		StringBuilder strBuild = new StringBuilder();
		
		String str = strBuild.append(num).toString();
		String revStr = strBuild.reverse().toString();
		
		if(str.equals(revStr)) {
			System.out.println(str+" is palindrome");
		}
	}

}
