package assignments_30;

public class SavingAccountTest {

	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(2000.00);
		SavingAccount saver2 = new SavingAccount(3000.00);

		SavingAccount.modifyInterestRate(0.03);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		saver1.displayBalance();
		saver2.displayBalance();

		SavingAccount.modifyInterestRate(0.04);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("Balances after 4% interest:");
		saver1.displayBalance();
		saver2.displayBalance();
	}
}
