package august25_2025;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {80,10,99,20,90};
		int result=num[0];
		
		for(int n: num) {
			if(result<n) {
				result=n;
			}
		}
		
		System.out.println(result);
	}

}
