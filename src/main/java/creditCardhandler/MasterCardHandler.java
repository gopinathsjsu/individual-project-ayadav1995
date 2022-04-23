package creditCardhandler;

import Factory.CreditCard;
import Factory.InvalidCreditCard;
import Factory.MasterCard;

public class MasterCardHandler implements CreditCardHandler {

	public CreditCardHandler next = null;
	
	public CreditCard handleNumber(long ccNumber) {
		
		String temp = String.valueOf(ccNumber);
		CreditCard card = null;
		
		if(temp != null && temp.length() == 16 && temp.charAt(0) == '5' && temp.charAt(1) >= '1' && temp.charAt(1) <= '5'){
			card = new MasterCard(ccNumber);
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
