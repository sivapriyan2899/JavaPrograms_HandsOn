package programs;

import java.util.ArrayList;
import java.util.List;

public class Comparable_prac implements Comparable<Comparable_prac> {

	
	String name;
	Integer salary;

	public Comparable_prac(String name, Integer salary) {
		
		this.name = name;
		this.salary=salary;	
	}
	
	//
	//
	//
	//
	
	public static void main(String[] args) {
		
		List<Comparable_prac> emplist = enteries();
		out_put(emplist);	
	}
	
	
	public static List<Comparable_prac> enteries() {

		List<Comparable_prac> emp = new ArrayList<Comparable_prac>();

		emp.add(new Comparable_prac("siva", 10000));
		emp.add(new Comparable_prac("jon", 5000));
		emp.add(new Comparable_prac("snow", 8000));
		emp.add(new Comparable_prac("mormont", 2000));
		
		return emp;
	}

	public static void out_put(List<Comparable_prac> e) {
		for (Comparable_prac comparable_prac : e) {
			System.out.println(comparable_prac.name + " " + comparable_prac.salary);
		}
	}

	@Override
	public int compareTo(Comparable_prac o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
