public class account {
	private int balance = 3000;

	public int balance() {
		return balance;
	}

	public void withdraw(int amount) throws InSufficientFundException {
		try {
			
		if (amount > balance) {
			throw new InSufficientFundException(String.format(
					"Current balance %d is less than requested amount %d",
					balance, amount));
		}
		
		if (amount < 0) {
			throw new IllegalBankTransactionException(String.format(
					"With-drawing amount is negative", amount));
		}
		balance = balance - amount;
		}
		catch(InSufficientFundException ife) {
			ife.printStackTrace();
		}
		catch(IllegalBankTransactionException ite) {
			ite.printStackTrace();
		}
	}
}
