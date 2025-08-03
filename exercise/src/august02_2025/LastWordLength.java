package august02_2025;


public class LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="good morning";
		String[] strArray = str.split(" ");
		
		StringBuilder strBuild = new StringBuilder();
		
		for(String s: strArray) {
			strBuild.append(s);
			strBuild.append(" ");
			}
		
		String revString = strBuild.reverse().toString();
		String[] strFinalArr = revString.split(" ");
		System.out.println(strFinalArr[1].length());
		
		
	}

}
