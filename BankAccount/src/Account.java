public class Account {
	protected String owner_name;
	protected String account_number;
	protected double balance;
	protected static final double balance_min = 50000;
	protected static final double fee = 5000;
	
	public String getOwner_name() {
		return owner_name;
	}
	public String getAccount_number() {
		return account_number;
	}
	public double getBalance() {
		return balance;
	}
	
	public Account(String owner_name, String account_number, double balance) {
		super();
		this.owner_name = owner_name;
		this.account_number = account_number;
		this.balance = balance;
		if(balance<balance_min) {
			this.balance=balance_min;
			System.out.println("Your inital balance is smaller than "+balance_min);
			System.out.println("Your inital balance has changed to: "+balance_min);
		}
	}
	
	public void depositBalance(double amount) {
		if(amount<=0) {
			System.out.println("Deposit amount must be positive");
		}
		else {
			balance += amount;
			System.out.println("Your balance after being deposited: "+balance);
		}
	}
	
	public void withdrawBalance(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdrawal amount");
		}
		else if(balance-amount-fee<balance_min) {
			System.out.println("Cannot withdraw, balance cannot be smaller than "+balance_min);
		}
		else {
			balance -= amount+fee;
			System.out.println("Your balance after being withdrawed: "+balance);
		}
	}
}