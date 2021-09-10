package newbankaccount;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1= new BankAccount("4563467879", 100.50);
		BankAccount acc2= new BankAccount("4563467879", 5000);
		BankAccount acc3= new BankAccount("4563467879", 4000);
	}

}

class BankAccount {
	//properties of Bank Account
	private static int iD=1000;
	private String accountNumber; //ID + rand 2-digi num + first 2 of SSN
	private static final String routingNumber="004500657";
	private String name;
	private String SSN;
	private double balance;
	
	public BankAccount(String SSN, double initDeposit) {
		this.SSN = SSN;
		this.balance = initDeposit;
		System.out.println("New Account Created");
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int rand = (int)(Math.random() * 100);
		accountNumber = iD + ""+rand + ""+ SSN.substring(0,2); 
		System.out.println(accountNumber);
	}
	
	
	public int getID() {
		return iD;
	}
	public void setID(int iD) {
		this.iD = iD;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getRoutingNumber() {
		return routingNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
