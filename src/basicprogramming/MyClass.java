package basicprogramming;

public class MyClass {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {15, 25, 10, 12,9,4};
		System.out.println("Min is :" + min(arr));
		System.out.println("Max is :" + max(arr));
		System.out.println("Avg is :" + avg(arr));

	}
	
	public static int min(int n[]) {
		int min = n[0];
		for(int i=0; i< n.length; i++) {
			if(n[i] < min) {
				min = n[i];
			}
		}
		return min;
	}
	
	public static int max(int n[]) {
		int max = n[0];
		for(int i=0; i< n.length; i++) {
			if(n[i] > max) {
				max = n[i];
			}
		}
		return max;
	}

	public static float avg(int n[]) {
		float avg=0, sum=0;
		for(int i=0; i< n.length ; i++) {
			sum = sum + n[i];
		}
		return (avg = sum/n.length);
	}


}
