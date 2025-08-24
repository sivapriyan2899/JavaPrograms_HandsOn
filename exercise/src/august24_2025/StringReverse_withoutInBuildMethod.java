package august24_2025;

public class StringReverse_withoutInBuildMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="siva";
		String[] strArray = str.split("");
		
		int strLength = strArray.length;
		
		//printing from last index using loop
		for(int i=strLength-1; i>=0; i--) {
			System.out.print(strArray[i]);
		}
	}
}
