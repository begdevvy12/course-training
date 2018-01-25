package basics;

public class Factorial {

	public static void main(String[] args) {
		// Call to the factorial function
		
		int factNum = 5;
		
		System.out.println(Factorials(factNum));

	}
	
	public static int Factorials (int factNum) {
		
		if (factNum == 1) {
			
			return 1;
		}
		else
		return factNum * Factorials(factNum - 1);
		
	}

}
