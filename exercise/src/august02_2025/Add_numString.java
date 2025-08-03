package august02_2025;

public class Add_numString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="si26a";
		int temp=0;

		char[] charArray =str.toCharArray();

		for(char c : charArray) {

			if(c>=48 && c<=57) {
				//System.out.println(c);			
				temp= (c-'0') + temp;
			}
		}
		System.out.println(temp);
	}
}
