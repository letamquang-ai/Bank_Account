public class SavingAccount extends Account{
	private static final double Annual_interest_rate = 0.026;
	
	public SavingAccount(String owner_name, String account_number, double balance) {
		super(owner_name, account_number, balance);
	}
	
	public void CalculateMonthlyInterest() {
		System.out.println("Your monthly interest: "+balance*Annual_interest_rate/12);
	}
	
	@Override
	public void withdrawBalance(double amount) {
        System.out.println("Withdrawals are not allowed for saving account");
    }
}
