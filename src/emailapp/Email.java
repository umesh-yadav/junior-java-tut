package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	
	//Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created for user : " + this.firstName + " " + this.lastName);
		
		//call a method asking for department - return the department
		this.department = setDepartment();
		//System.out.println("Department is : " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your default password is :  " + this.password) ;
		
		//combine element to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+ department + "." + companySuffix;
		System.out.println("Your email is : " + email);		
	}
	
	//ask for the department
	private String setDepartment() {
		System.out.print("New employee : " + this.firstName +  ". DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code :");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "sales";  }
		else if(depChoice == 2) { return "dev";  }
		else if(depChoice == 3) { return "accnt";  }
		else { return ""; }
	}
	
	//generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set an alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	
	public int getMailboxCapacity() { return this.mailboxCapacity; }
	
	public String getAlternateEmail() {return this.alternateEmail;  }
	
	public String getPassword() {return this.password; }
	

	public String showInfo() {
		return ("DISPLAY NAME : " + this.firstName  + " " + this.lastName +
				"\nEmail : " + this.email + 
				"\nMailbox Capacity : " + this.mailboxCapacity);
	}

}
