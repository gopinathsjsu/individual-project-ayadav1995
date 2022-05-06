package Factory;

public abstract class CreditCard {

	private long cardNumber;
	private String type;


	public CreditCard(long cardNumber, String type, String error) {
	
		this.cardNumber = cardNumber;
		this.type = type;

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


}
