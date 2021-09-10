package newstudentdb;

public class StudentDatabase {
	private String name;
	private String SSN;
	private String email;
	private static int iD=100;
	private double balance=0;
	private String city;
	private String state;
	private String phone;
	private String course="";
	private static final int courseCost = 3000;
	
	private String company="@company.com";
	
	
	public StudentDatabase(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		createEmail();
		generateStudentID();
		iD++;
	}
	
	private void createEmail() {
		email = name.toLowerCase() + "." + iD  +""+company;
		System.out.println(email);
	}
	
	private void generateStudentID() {
		int rand = (int)(Math.random()* 8000 + 1000);
		SSN = SSN.substring(SSN.length()-4, SSN.length());
		System.out.println(iD + "" + rand + "" + SSN);
	}
	
	
	public void enroll(String course) {
		this.course += course;
		System.out.println("Enrolled in " + course);
		balance = balance + courseCost;
	}
	
	public void checkBalance() {
		System.out.println("Balance is  $" + balance);
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("Thank you for paying : $" + amount);
		checkBalance();
	}

	public void showCourses() {
		System.out.println("entrolled in " + course);
	}
	
	public String toString() {
		return "[ Name : " + name + " ]\n[ Email : " + email  + " ]";
	}
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
}
