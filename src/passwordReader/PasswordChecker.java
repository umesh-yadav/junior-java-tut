package passwordReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class PasswordChecker {

	public static void main(String[] args) {
		String filename ="C:\\Users\\Umesh\\Desktop\\password.txt";
		String []password = new String[13];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
			for(int i=0; i<password.length; i++) {
				password[i] = br.readLine();				
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error : File no found");
		} catch (IOException e) {
			System.out.println("Error : Could not read file");
		}
		
		try {
			for(int n=1; n <=password.length; n++) {
				
				System.out.println("Your password is : " + password[n] + "*********************");
			
				for(int i=0; i<n; i++) {
					if(!("0123456789".contains(password[i].substring(i, i+1)))) {
						throw new NumberNotFound(password[i]);
					}
					else if(!("abcdefghijklmnopqrstuvwxyz".contains(password[i].substring(i, i+1)))) {
						throw new LetterNotFound(password[i]);
					}
					else if(!("!@#$)_/(-=%+".contains(password[i].substring(i, i+1)))) {
						throw new SpecialCharNotFound(password[i]);
					} else {
						System.out.println("Invalid Character");
					}
				}
				System.out.println(password);
			}
			
		}
		catch(NumberNotFound e) {
			System.out.println("Error : Password does not contain any number");
			System.out.println(e.toString());
		} catch (LetterNotFound e) {
			System.out.println("Error : Password does not contain any letter");
			System.out.println(e.toString());
		} catch (SpecialCharNotFound e) {
			System.out.println("Error : Password does not contain any special character like ! @ #");
			System.out.println(e.toString());
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
		
	}

}



class NumberNotFound  extends Exception{
	String pass;
	public NumberNotFound(String pass) {
		this.pass = pass;
	}	
	public String toString() {
		return ("NumberNotFound : " + pass);
	}	
}

class LetterNotFound  extends Exception{
	String pass;
	public LetterNotFound(String pass) {
		this.pass = pass;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return ("LetterNotFound : " + pass);
	}
}


class SpecialCharNotFound extends Exception{
	String pass;
	public SpecialCharNotFound(String pass) {
		this.pass = pass;
	}
	
	public String toString() {
		return ("SpecialCharNotFound : " + pass);
	}
}



