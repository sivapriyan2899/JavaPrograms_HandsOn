package august06_2025;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array_1 = {2,4,3};
		int[] array_2 = {5,6,4};
		
		//input 2+4+3 = 243   | 5+6+4 = 564
		// 243+564 = 807 ---> expected output [7,0,8]
		
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		for(int i: array_1) {
			list1.add(i);
		}
		
		for(int x: array_2) {
			list2.add(x);
		}
		
		//System.out.println(list1+" "+list2);
		
		int temp_list1=0;
		int temp_list2=0;
		
		for(int i=list1.size()-1; i>=0; i--) {
			
			temp_list1 = (temp_list1*10) + list1.get(i);
		}
		//System.out.println(temp_list1);
		for(int j=list2.size()-1; j>=0; j--) {
			temp_list2 = (temp_list2*10) + list2.get(j);
		}
		//System.out.println(temp_list2);
		
		int revResult = temp_list1 + temp_list2 ;
		//System.out.println(result);
		
		int modulusTemp=0;
		
		List<Integer> sumResult = new LinkedList<Integer>();
		while(revResult>0) {
			
			modulusTemp = revResult%10;	
			sumResult.add(modulusTemp);
			revResult = revResult/10;
		}	
		System.out.println(sumResult);		
	}
}
