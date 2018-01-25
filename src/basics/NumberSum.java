// I wrote it two ways for fun

package basics;

public class NumberSum {

	public static void main(String[] args) {
		// Declare number to pass into function
		
		int SumNum = 9;
		
	//	System.out.println(SumNumber(SumNum));

		System.out.println(ForSum(SumNum));
}

	
	public static int SumNumber(int SumNum) {
	
		if(SumNum == 0)
		{
			
			return 0;
		}
		else
			return SumNum + SumNumber(SumNum-1);
		
	}
	


public static int ForSum(int SumNum) {

int value = SumNum;	
	
	for(int x = SumNum; x != 0; x--) {
		
		value = value + (x - 1);
	}
	return value;
	
}


}