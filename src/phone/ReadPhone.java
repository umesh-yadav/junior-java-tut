package phone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename = "C:\\Users\\Umesh\\Desktop\\phone.txt";
		String phonenum="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
			phonenum = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error : File no found");
		} catch (IOException e) {
			System.out.println("Error : Could not read file");
		}
		
		try {
			if(phonenum.length() !=10) {
				throw new TenDigitsException(phonenum);
			}
			
			if((phonenum.substring(0, 1).equals("0")) || (phonenum.substring(0, 1).equals("9"))) {
				throw new AreaCodeException(phonenum);
			}
			
			for(int n=0; n<phonenum.length()-2;n++) {
				if(phonenum.substring(n, n+1).equals("9")) {
					if(phonenum.substring(n+1, n+3).equals("11")){
						throw new EmergencyException(phonenum);
					}
				}
			}
			
			System.out.println(phonenum);
		}catch(TenDigitsException e) {
			System.out.println("Error : Phone number is not 10 digits");
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("Error : Phone number invalid area code");
			System.out.println(e.toString());
		} catch (EmergencyException e) {
			System.out.println("Error : emergency 911");
			System.out.println(e.toString());
		}
		

	}

}


class TenDigitsException extends Exception{
	String num;
	public TenDigitsException(String num) {
		this.num = num;
	}
	
	public String toString() {
		return ("TenDigitException : " + num);
	}
}

class AreaCodeException  extends Exception{
	String num;
	public AreaCodeException(String num) {
		this.num = num;
	}
	
	public String toString() {
		return ("AreaCodeException : " + num);
	}
	
}

class EmergencyException  extends Exception{
	String num;
	public EmergencyException(String num) {
		this.num = num;
		// TODO Auto-generated constructor stub
	}
	

	public String toString() {
		return ("EmergencyException : " + num);
	}
	
}


