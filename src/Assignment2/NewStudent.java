package Assignment2;

public class NewStudent {
	
	private static int iD = 1000;
	private double balance = 2500;
	private String name;
	private String userID;
	private String email;
	private String phone;
	private String city;
	private String state;
	
	
	// Creating Constructor for creating the email and user ID
	
	NewStudent(String name, String SSN){
		
		this.name = name;

		
		this.email = name.substring(0,1) + name + (int) (Math.random() * ((999 - 100) + 1) +100) + "@college.com";
		
		System.out.println("Your email address is: " + this.email + "\n");
		
		this.userID = iD + "" +  (int) (Math.random() * ((9000 - 1000) + 1) +1000) + SSN.substring(SSN.length() - 4,SSN.length());
		
		System.out.println("Your new User ID  is: " + this.userID + "\n");
		
		
	}
	
	// Provides student with phone, city and state entered
	
	@Override
	public String toString() {
		
		return "Name: " + name + " | Phone Number: " + phone + " | City: " + city + " | State: " +  state + "\n";
	}
	
	
	// Begin enrollment process
public void enroll() {
		
	System.out.println("Thank you for choosing College A.\n");
	
	System.out.println("You advisor is Mr. Greg Shin\n");
	
	System.out.println("Your courses have already been assigned based on the education path choosen.  Please pay your balance then review your course list.\n");
	
		
	}


public void checkBalance() {
	
	if(balance != 0) {
	
	System.out.println("You currently owe: " + balance + "\n");
	
	}
	
	else
		System.out.println("You've paid your balance in full!\n");
}
	
public void pay(int amount) {
		
	
	System.out.println("Processing payment of $" + amount + "...\n");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
		balance = balance - amount;
		
		if(balance != 0) {
		
			System.out.println("Please ensure that your are paying off your full balance or you won't be able to enroll.\n");
		}
		else {
		System.out.println("Thank you for your payment of $" + amount + "!\n");
		checkBalance();
		try {
			showCourse();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		
		
	}





public void showCourse() throws InterruptedException {
	
	String[] courses = {"Calculus I", "Intro to CS", "English II", "Intro to Web Development"};
	
	System.out.println("Generating course list...\n");
	Thread.sleep(2000);
	
	System.out.println("The courses you are taking this semester are as follows:\n");
	
	
	
	for(int i = 0; i < courses.length; i++) {
		
		
		System.out.println(courses[i]);
		if(i< courses.length - 1) {
		System.out.println("-------------");
		}
		
	}
}


public String getPhone() {
	return phone;
}


public void setPhone(String phone) {
	this.phone = phone;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}
	
	
	


}
