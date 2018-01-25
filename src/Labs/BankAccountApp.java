package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("465329874", 1000);
		BankAccount acc2 = new BankAccount("549416318", 2000);
		BankAccount acc3 = new BankAccount("331161615", 2500);

		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDesposit(500);
		acc1.makeDesposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
		
	}

}



class BankAccount implements IInterest{
	
	private static int iD = 1000;				// Internal ID
	private String accountNumber; // iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	
	// Constructors
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		
		this.SSN = SSN;
		iD++;
		//System.out.println(iD);
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * ((99 - 10) + 1) + 10);
		//System.out.println(random);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " +  accountNumber);
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public void payBill(double amount) {
		
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDesposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		
		System.out.println("Balance: " + balance);
		
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
		
	}
	
	@Override
	public String toString() {
		
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber +
				"]\n" + "[Balance " + balance + "]";
		
		
	}

	
	
	
}