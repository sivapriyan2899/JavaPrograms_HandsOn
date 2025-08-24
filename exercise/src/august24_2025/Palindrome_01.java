package august24_2025;

public class Palindrome_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer num = 121;
		String strNum = num.toString();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(strNum);
		strBuilder.reverse();
		
		String revString = strBuilder.toString();
		
		if (strNum.equals(revString)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
	}
}
