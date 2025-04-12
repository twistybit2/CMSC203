package Lab6;

public class CheckingAccount extends BankAccount{
	private static final int FEE = 15;
	
	
	public CheckingAccount(String name, int amount) {
		super(name, amount);
		
		String funnyNumber = getAccountNumber() + "-10";
        setAccountNumber(funnyNumber);
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		return super.withdraw(amount + FEE);
		
	}
}
