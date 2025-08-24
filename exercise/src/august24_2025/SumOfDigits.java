package august24_2025;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=143, temp=0, result=0;

		while(num>0) {
			temp=num%10;
			result=result+temp;
			num=num/10;
		}
		System.out.println(result);


	}

}
