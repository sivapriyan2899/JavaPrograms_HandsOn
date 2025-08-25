package august25_2025;

public class MultiplicationTable {
	
	public void table(int num) {
		
		for(int i=1; i<=10;i++) {
			System.out.println(i+" x "+num+" = "+ i*num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTable multiplicatioTable = new MultiplicationTable();
		multiplicatioTable.table(8);
	}

}
