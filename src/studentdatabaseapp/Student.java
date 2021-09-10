package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse = 600;
	private static int id =1000;
	
	//constructor : prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name : ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name : ");
		this.lastName = in.nextLine();
		
		System.out.print("F - Fresher\nSO- Sophmore\nJ - Junior\nSE - Senior\nEnter student grade level : ");
		this.gradeYear = in.nextLine(); 
		
		setStudentID();
			

	}
	
	
	//generate a ID 
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID =  new String(this.gradeYear + "" + id);
	}
	
	//Enroll in courses
	public void enroll() {
		//Get inside loop, user hits 0
		
		String course = "";
		while(!course.equalsIgnoreCase("Q")){
			System.out.print("Enter course to enroll (Q to quit) :");
			Scanner in = new Scanner(System.in);
			course = in.nextLine();	
			
			if(!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;	
			}else {
				break;				
			}

		}
		
	}
	
	
	//View balance
	
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" +payment);
		viewBalance();
	}
	
	
	//show status
	public String showInfo() {
		return ("\n\nName: " + firstName + " " + lastName + 
				 "\nStudent ID : " + studentID +
				 "\nCourses Enrolled:" + courses + 
				 "\nBalancs : $" + tuitionBalance
				);
	}

}
