
public class IllegalBankTransactionException extends RuntimeException{
	private String message;

	public IllegalBankTransactionException(String message) {
		this.message = message;
	}

	public IllegalBankTransactionException(Throwable cause, String message) {
		super(cause);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
