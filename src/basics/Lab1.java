package basics;

public class Lab1 {

	public static void main(String[] args) {
		// Function to take value N and return sum of 1 to N
		//System.out.println(sum(5));
		
		int [] numbers = {5, -2, 0, 234, -438, 63};
		
		System.out.println("Min: " + findMin(numbers));
		
		System.out.println("Max: " + findMax(numbers));
		
		System.out.println("Average: " + findAvg(numbers));
		
	}
	
	public static int findAvg(int[] arr) {
		// Take sum and divide by number of elements
	
		int sum = 0;
		
for (int i = 0; i < arr.length; i++) {
			
	sum = sum + arr[i];
	
	}

return sum/arr.length;

	}
	
	
	//Array Function - Min
	
	public static int findMin(int[] array) {
		
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < min) {
				min = array[i];
			}
			
		}
		return min;
	}

	//Array Function - Max
	
	public static int findMax(int[] array) {
		
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > max) {
				max = array[i];
			}
			
		}
		return max;
	}
	
	
	
	public static int sum(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			sum = sum + i;
		}
		return sum;
		
	}

	
	
}
