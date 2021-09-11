package CollectionPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\Umesh\\Desktop\\accounts.csv";
		double balance=0;
		String testrow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
			
			while((testrow = br.readLine()) !=null) {
				String[] line = testrow.split(",");
				data.add(line);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String[] acc : data) {
			String date = acc[0];
			String type = acc[1];
			String com = acc[2];
			double cost = Double.parseDouble(acc[3]);
			
			if(type.equalsIgnoreCase("credit")) {
				balance = balance + cost;
			}else if (type.equalsIgnoreCase("debit")) {
				balance = balance - cost;
			}else {
				System.out.println("Other transactions");
			}
			System.out.println("Your balance is : $ " + balance);
		}
		
		if(balance > 0) {
			System.out.println("Your total bill is : $ " + balance *1.1);
		}else if(balance <0) {
			System.out.println("Thanks for your payment");
			System.out.println("You have a overpayment of $" + balance);
		}else {
			System.out.println("Thanks for your payment");
		}
	}

}
