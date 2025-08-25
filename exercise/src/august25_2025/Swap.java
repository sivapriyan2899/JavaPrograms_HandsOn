package august25_2025;

public class Swap {
	
	
	
	public void usingThirdVar(int a, int b) {
		
		int temp=0;
		
		System.out.println("before swap");
		System.out.println("a= "+a+" and b= "+b);
		temp=b;
		b=a;
		a=temp;
		
		System.out.println("after swap with third var");
		System.out.println("a= "+a+" and b= "+b);
		
	}
	
	public void withoutThirdVar(int a, int b) {
		
		System.out.println("before swap");
		System.out.println("a= "+a+" and b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap without third var");
		System.out.println("a= "+a+" and b= "+b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Swap swap = new Swap();
	swap.usingThirdVar(10,3);
	swap.withoutThirdVar(2,6);

	}

}
