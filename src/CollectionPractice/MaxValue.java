package CollectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxValue {
	
	public static int findMax(List<Integer> l, int n) {
		int max = l.get(0);
		
		int sum = l.get(0);
		
		for(int i=1; i<n; i++) {
			if(l.get(i)>max) {
				max = l.get(i);
				sum = sum + max;
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
