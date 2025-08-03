package august01_2025;

import java.io.IOException;

public class LowerCaseTOUpperCase {

	private String str;

	//dummy constructor
	public LowerCaseTOUpperCase() {
		System.out.println("im constructor");
	}

	//getter method
	public String getName() {
		return str;
	}

	//setter method
	public void setName(String name) {
		this.str = name;
	}	

	//converting char to array
	public char [] convertTocharArray(){

		return str.toCharArray();
	}

	
		//loopingMethod which has actual logic
		public String loopingMethod(char[] arrayOfChar) {

			StringBuilder strBuild = new StringBuilder();

			try {
			for(char c : arrayOfChar) {

				if(c>=97 && c<=122 ) {
					c=(char) (c-32);
					strBuild.append(c);
				//	throw new IllegalArgumentException();
				}else if(c>=65 && c<=90) {
					c=(char) (c+32);
					strBuild.append(c);
				}
				else
					strBuild.append(c);
			}
			
		}
			catch (Exception e){
				e.printStackTrace();
			}
			return strBuild.toString();
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LowerCaseTOUpperCase classObject = new LowerCaseTOUpperCase();


		classObject.setName("sIva");
		char[] charArray = classObject.convertTocharArray();
		String result = classObject.loopingMethod(charArray);

		System.out.println(result);

	}
}
