package august02_2025;

public class ArrayOfNum_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sample input: num=[2,5,3,1] target=8
		//output: [1,2]
		//meaning: num[1]+num[2] = 5+3 = 8
		
		int arr[] = {4,3,5,6};
		int target=8;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				Integer sum = arr[i]+arr[j];
				if(sum.equals(target)) {
					System.out.println(i+" "+j);
					return;
				}
				
			}
			
		}
		
	}

}
