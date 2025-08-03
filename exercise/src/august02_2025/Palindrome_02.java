package august02_2025;

public class Palindrome_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1521, temp=0, result=0;
		int num=i;
		
		while(num>0) {
			temp=num%10;
			result=(result*10)+temp;
			num=num/10;
		}
		
		if(i==result) {
			System.out.println("true");;
		}
		else
			System.out.println("false");
		
	}

}
