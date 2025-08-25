package august25_2025;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		boolean isPrime = true;
		
		if(num<=0) {
			isPrime=false;
		}
		else {
			for(int i=2; i<=num/2;i++) {
				if(num%i==0) {
					isPrime =false;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}else
			System.out.println(num+" is not a prime number");
	}
}
