package july29_2025;

public class PracArray {

	String str = "banana";

	public void strTochararray() {

		char[] strarray = str.toCharArray();
		System.out.println("im charArray");
		
		for(Character c: strarray) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
	}

	public void strTostrarray() {

		String[] strArray = str.split("");
		
		System.out.println("im strArray");
		
		for(String s: strArray) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracArray pra = new PracArray();
		
		pra.strTochararray();

		pra.strTostrarray();

	}
}

