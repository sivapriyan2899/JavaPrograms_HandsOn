package august24_2025;

import java.util.Arrays;

public class SecondLargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArray = {14,20,3,19,80,45};
		
		Arrays.sort(numArray);
		System.out.println("Second largest num is "+numArray[(numArray.length)-2]);
	}
}
