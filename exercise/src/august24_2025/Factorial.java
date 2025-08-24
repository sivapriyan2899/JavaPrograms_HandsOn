package august24_2025;

public class Factorial {
	
	public int usingWhile(int num) {
		int result=1;
		while(num>0) {
			result = result*num;
			num--;
		}
		return result;
	}

	public int usingFor(int num) {
		int result=1;
		for(int i=num; i>0;i--) {
			result = result*i;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial factorial = new Factorial();
		System.out.println("Using while loop "+factorial.usingWhile(5));
		System.out.println("Using for Loop "+factorial.usingFor(6));
		System.out.println("Using while loop "+factorial.usingWhile(7));

	}

}
