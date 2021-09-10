package bankaccountapp;

public class Checking extends Account {

	//List properties specific to checking account
	private long debitCarNumber;
	private int debitCardPin;
	
	//constructor to initiaze checking account properties
	public Checking(String name, String 	sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	
	private void setDebitCard() {
		debitCarNumber = (long)(Math.random() * Math.pow(10, 12));
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
	}

	
	//List any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE : Checking");
		System.out.println(" Your Checking Account Features "
				+ "\n Safety Deposit Box ID : " + debitCarNumber +
				"\n Safety Deposit Box Code : " + debitCardPin 
				);
	}
	
}
