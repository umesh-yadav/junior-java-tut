package CollectionPractice;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] users = {
				{"Umesh", "Kumar", "yadavumesh8090@gmail.com","86505454"},
					{"Raj", "Kumar", "yadavumesh8890@gmail.com", "695894"},
					{"Raj", "Kumar", "yadavumesh8890@gmail.com", "695894"},
					{"Raj", "Kumar", "yadavumesh8890@gmail.com", "695894"},
					{"Raj", "Kumar", "yadavumesh8890@gmail.com", "695894"},
		};
		
		
		long start = System.currentTimeMillis();
		//traverse using double array
		for(int i=0; i<users.length; i++) {
			for(int j=0; j<i; j++) {
				String firstname = users[i][j];
				String lasttname = users[i][j];
				String email = users[i][j];
				String phn = users[i][j];
				System.out.println(firstname + " " + lasttname + " " + email + " " + phn);
				
			}
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Traversing takes" +
                (end - start) + " ms");
		
		long start1 = System.currentTimeMillis();
		for(String[] user: users) {
			for (String field : user) {
				System.out.print(field +" ");
			}
			System.out.println("");
		}
		long end1 = System.currentTimeMillis();
		
		System.out.println("Traversing using for each takes" +
                (end1 - start1) + " ms");
	}

}
