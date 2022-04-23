package bean;

import java.util.Date;

public class CardDetails {
	
	private long CardNumber;
	private Date ExpirationDate;
	private String NameOfCardholder;
	
	public long getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(long cardNumber) {
		CardNumber = cardNumber;
	}
	public Date getExpirationDate() {
		return ExpirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		ExpirationDate = expirationDate;
	}
	public String getNameOfCardholder() {
		return NameOfCardholder;
	}
	public void setNameOfCardholder(String nameOfCardholder) {
		NameOfCardholder = nameOfCardholder;
	}
}
