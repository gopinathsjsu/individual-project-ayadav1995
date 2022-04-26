package creditCardhandler;

import Factory.CreditCard;
import Factory.DiscoverCard;
import Factory.InvalidCreditCard;

public class DiscoverCardHandler implements CreditCardHandler {

	public CreditCardHandler next = null;
	
	public boolean handleNumber(long ccNumber) {
		
		String temp = String.valueOf(ccNumber);
		CreditCard card = null;
		boolean isValid = false;
		
		if(temp != null && temp.length() == 16 && temp.substring(0,4).equals("6011")){
			card = new DiscoverCard(ccNumber);
			isValid = true;
		}
		else if(next != null) {
			isValid = next.handleNumber(ccNumber);
		}
		else {
			card = new InvalidCreditCard(ccNumber);
		}
		
		return isValid;
		
	}

	public void setNext(CreditCardHandler next) {
		this.next = next;
	}

}
