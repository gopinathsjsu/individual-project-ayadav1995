package creditCardhandler;

import Factory.AmericanExpressCard;
import Factory.CreditCard;
import Factory.InvalidCreditCard;

public class AmericanExpressCardHandler implements CreditCardHandler {
	
	public CreditCardHandler next = null;

	public CreditCard handleNumber(long ccNumber) {
		
		String temp = String.valueOf(ccNumber);
		CreditCard card = null;
		
		if(temp != null && temp.length() == 15 && temp.charAt(0) == '3' && (temp.charAt(1) == '4' || temp.charAt(1) == '7')){
			
			card = new AmericanExpressCard(ccNumber);
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
