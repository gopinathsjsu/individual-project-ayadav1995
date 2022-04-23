package creditCardhandler;

import Factory.CreditCard;
import Factory.InvalidCreditCard;
import Factory.VisaCard;

public class VisaCardHandler implements CreditCardHandler{

	public CreditCardHandler next = null;
	
	public CreditCard handleNumber(long ccNumber) {
		
		String temp = String.valueOf(ccNumber);
		CreditCard card = null;
		
		if(temp != null && temp.charAt(0) == '4' && (temp.length() == 13 || temp.length() == 16)){
			card = new VisaCard(ccNumber);
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
