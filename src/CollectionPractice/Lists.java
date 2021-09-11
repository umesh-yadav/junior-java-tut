package CollectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {

	public static int findMax(List<Integer> list, int size) {
		
		int incl = list.get(0);
		int excl = 0;
		int excl_new;
		for (int i=1; i<size ; i++) {
			
			excl_new = (incl > excl) ? incl : excl;
			System.out.println("excl_new value is " + excl_new + " on iteration : " + i);
			incl = excl + list.get(i);
			System.out.println("incl value is " + incl + " on iteration : " + i);
			excl = excl_new;
			System.out.println("excl value is " + excl + " on iteration : " + i);
			System.out.println("******************\n");
		}
		
		
		return ((incl > excl) ? incl : excl);
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<6; i++ ) {
			list.add(sc.nextInt());
		}
		
		for(Integer l: list) {
			System.out.println(l);
		}
		
		System.out.println(findMax(list, list.size()));
		
	}

}
