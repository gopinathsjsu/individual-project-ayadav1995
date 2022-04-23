package creditCardhandler;

import Factory.CreditCard;
import Factory.DiscoverCard;
import Factory.InvalidCreditCard;

public class DiscoverCardHandler implements CreditCardHandler {

	public CreditCardHandler next = null;
	
	public CreditCard handleNumber(long ccNumber) {
		
		String temp = String.valueOf(ccNumber);
		CreditCard card = null;
		
		if(temp != null && temp.length() == 16 && temp.substring(0,4).equals("6011")){
			card = new DiscoverCard(ccNumber);
		}
		else if(next != null) {
			card = next.handleNumber(ccNumber);
		}
		else {
			card = new InvalidCreditCard(ccNumber);
		}
		
		return card;
		
	}

	public void setNext(CreditCardHandler next) {
		this.next = next;
	}

}
