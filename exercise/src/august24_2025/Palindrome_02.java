package august24_2025;

public class Palindrome_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 828;
		int temp=0, revInt=0, original=num;
		
		while(num>0) {
		temp=num%10;
		revInt=(revInt*10)+temp;
		num=num/10;
		}
		
		if(original==revInt) {
			System.out.println("palindrome");
		}else
			System.out.println("not a palindrome");
		
		//System.out.println(revInt);
	}

}
