
package Assessmentday4;

public class BankBalance {
	double balance = 0;
	int transfercount = 0;
	double transferamount = 0;

	public BankBalance(double amount) {
		balance = amount;
		System.out.println("Acount balance is:" + amount);
	}

	private void withdrawal(double amount) {
		transfercount++;
		transferamount += amount;
		if (transfercount >= 100000) {
			throw new TransactionAmountException("Amount Exceeded 100000");
		} else {

		}
	}

}
