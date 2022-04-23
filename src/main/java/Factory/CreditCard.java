package Factory;

public abstract class CreditCard {

	private long cardNumber;
	private String type;
	private String error;

	public CreditCard(long cardNumber, String type, String error) {
	
		this.cardNumber = cardNumber;
		this.type = type;
		this.error = error;
	}
	
	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
