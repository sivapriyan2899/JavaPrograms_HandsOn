package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_prac1 implements Comparable<Comparable_prac1> {

	Integer num;
	 public Comparable_prac1(Integer num) 
	  { 
		 this.num=num;
	   }
	
	public int compareTo(Comparable_prac1 o) {
		// TODO Auto-generated method stub
		if(this.getnum() > o.getnum()){
			return 1;
		}
		else if(this.getnum() < o.getnum())
			return -1;
		else 
			return 0;
	}
	
	
	 
	 public Integer getnum() {
		 return num;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Comparable_prac1> siv = new ArrayList<Comparable_prac1>();
		siv.add(new Comparable_prac1(10));
		siv.add(new Comparable_prac1(1));
		siv.add(new Comparable_prac1(0));
		
		for (Comparable_prac1 e : siv) {
			System.out.println(e.getnum());
		}
		//System.out.println("before sort" + siv);
		
		Collections.sort(siv);
		
		System.out.println("after sort");
		for (Comparable_prac1 e : siv) {
			System.out.println(e.getnum());
		}
		
		//System.out.println(siv);
		
		
	}
}
