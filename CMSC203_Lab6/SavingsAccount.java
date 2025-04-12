package Lab6;

public class SavingsAccount extends BankAccount{
	
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber; //hides it
	
	//End attribute zone
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + " - " + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount yourAccount, double initialBalance) {
	    super(yourAccount.getOwner(), initialBalance); // make sure getOwner() is in BankAccount
	    this.savingsNumber = yourAccount.savingsNumber + 1;
	    this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}

	public void postInterest() {
		double interesting = getBalance() * (rate / 12); //calculate interest
        deposit(interesting);
        
	}
	
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }


}
