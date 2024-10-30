public class BankAccount {
	public static void main(String args []) {
		Account account_a = new Account("LLL", "11111221", 1000000);
		account_a.depositBalance(100000);
		account_a.withdrawBalance(70000);
		SavingAccount account_b = new SavingAccount("abc", "0000", 40000);
		account_b.depositBalance(50000);
		account_b.CalculateMonthlyInterest();
		account_b.withdrawBalance(50000);
	}
}
