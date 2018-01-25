package Assignment2;

public class StudentDB {

	public static void main(String[] args) throws InterruptedException {
		
		NewStudent stud = new NewStudent("Bill", "14684616");
		stud.setCity("New Orleans");
		stud.setPhone("654 805 6321");
		stud.setState("LA");
		
		System.out.println(stud.toString());
		
		stud.enroll();
		
		stud.checkBalance();
		
		stud.pay(2500);
		
	

		
		
	}

}
