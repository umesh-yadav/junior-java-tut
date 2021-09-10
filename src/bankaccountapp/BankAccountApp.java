package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Users\\Umesh\\Desktop\\NewBankAccounts.csv";
		
//		Checking ch = new Checking("Umesh", "123456789", 1500);
//		
//		Savings sh = new Savings("Ram", "546256478", 2500);
//		ch.showInfo();
//		sh.showInfo();
//		
//		
//		sh.deposit(5000);
//		sh.withdraw(200);
//		sh.transfer("Brokerage", 3500);
//		sh.compound();
//		
		
		double[] d= new double[5];
		d[1]=5.0;
		System.out.println(d[1]);
		//Read a csv file then create new accounts based on that data
		List<String[]> newCustomers = utilities.CSV.read(file);
		for(String[] accountHolder : newCustomers) {
				String name = accountHolder[0] + " " + accountHolder[1];
				String sSN = accountHolder[2];
				String accountType = accountHolder[3];
				double initDeposit = Double.parseDouble(accountHolder[4]);
			
				if(accountType.equals("Savings")) {
					accounts.add(new Savings(name, sSN, initDeposit));
					
				}else if(accountType.equals("Checking")){
					accounts.add(new Checking(name, sSN, initDeposit));
				}else {
					System.out.println("Error reading account type");
				}
		}
		
		for(Account acc: accounts) {
			System.out.println("*************************************************************");
				acc.showInfo();
				System.out.println("\n\n");
		}
	}

}
