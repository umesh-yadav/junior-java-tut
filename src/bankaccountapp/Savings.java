package bankaccountapp;

public class Savings extends Account {
	
	//List properties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
//constructor to initiaze saving account properties
	public Savings(String name, String 	sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	public void setRate() {
		rate = getBaseRate() - .25;
	}

	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	
	
//List any methods specific to saving account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE : Savings");
		System.out.println(" Your Saving Account Features "
				+ "\n Safety Deposit Box ID : " + safetyDepositBoxID +
				"\n Safety Deposit Box Code : " + safetyDepositBoxKey
				);
	}

}
