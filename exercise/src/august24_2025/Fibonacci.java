package august24_2025;

public class Fibonacci {
	
	int  a=0, b=1, c=0;
	
	public void doCalculation(int num) {
		
		for(int i=0; i<num; i++) {
			System.out.println(c);
			c=a+b;
			b=a;
			a=c;	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibo = new Fibonacci();
		fibo.doCalculation(5);
	}

}
