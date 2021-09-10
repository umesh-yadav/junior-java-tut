package newstudentdb;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDatabase s1 = new StudentDatabase("Umesh", "154363375");
		StudentDatabase s2 = new StudentDatabase("Umesh", "154363335");
		StudentDatabase s3 = new StudentDatabase("Umesh", "154363585");
		System.out.println(s1.toString());
		s1.enroll("Eng-504");
		s1.enroll("Hin-505");
		s1.pay(1000);
		s1.checkBalance();
		System.out.println(s2.toString());
		
	}

}
