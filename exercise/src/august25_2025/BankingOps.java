package august25_2025;

import java.util.Scanner;

public class BankingOps {
	
	private String UserName="siva";
	private String Password="123";
	
	
	
	public void depositMoney() {
		System.out.println("please enter the amount to deposit");
		
	}
	
	public void cashWithdrawl() {
		
	}
	
	public void checkBalance() {
		
	}
	
	public int selectOptions() {
		Scanner scanInput = new Scanner(System.in);
		System.out.println("press 1 for Deposit");
		System.out.println("press 2 for Withdrawl");
		System.out.println("press 3 for CheckBalance");
		
		int option = scanInput.nextInt();
		return option;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankingOps bank = new BankingOps();
		int selectedOption =bank.selectOptions();
		
		switch (selectedOption) {
		case 1:
			bank.depositMoney();
			
			break;
		case 2:
			bank.cashWithdrawl();
			break;
		case 3:
			bank.checkBalance();
			break;
		default:
			System.out.println("enter correct option");
			break;
		}
		
		
		//bank.verifyUser();
		
	}
	
public boolean verifyUser() {
		
		Scanner scanInput = new Scanner(System.in);
		System.out.println("enter username");
		String name=scanInput.nextLine();
		System.out.println("enter password");
		String pWord=scanInput.nextLine();
		
		if(UserName.equals(name) && Password.equals(pWord)) {
			System.out.println("successful login");
			return true;
		}
		return false;	
	}

}
