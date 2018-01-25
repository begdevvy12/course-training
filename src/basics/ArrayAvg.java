package basics;

public class ArrayAvg {

	public static void main(String[] args) {
		// Declare Array
		
		int[] averageNum;
		
		averageNum = new int[10];
		
		for(int x = averageNum.length - 1; x >= 0; x--) {
			
			averageNum[x] = x;
		}
		
	// System.out.println(averageNum[9]);
		
		arrayMin(averageNum);
		arrayMax(averageNum);
		arrayAvg(averageNum);

	}
	
	
public static void arrayMin(int[] avgMin) {
	
	// Declare variable to hold minimum value
		int min = avgMin[9];
		
		for(int x = 0;  x < avgMin.length - 1; x++) {	
		
			if(avgMin[x] < min) {
				min = avgMin[x];
			}
		}
		System.out.println( "The minimum value in the array is:" + min);
	}
	
public static void arrayMax(int[] avgMax) {
	
	// Declare variable to hold minimum value
		int max = avgMax[9];
		
		for(int x = 0;  x < avgMax.length - 1; x++) {	
		
			if(avgMax[x] > max) {
				max = avgMax[x];
			}
		}
		System.out.println( "The maximum value in the array is:" + max);
	}

public static void arrayAvg(int[] avgAverage) {
	
	// Declare variable to hold minimum value
		double sum = 0;
		double average;
		
		for(int x = 0;  x < avgAverage.length; x++) {	
		
			sum = sum + avgAverage[x];
		}
		
		average = sum/avgAverage.length;
		
		System.out.println( "The average of the array is:" + average);
	}

}
