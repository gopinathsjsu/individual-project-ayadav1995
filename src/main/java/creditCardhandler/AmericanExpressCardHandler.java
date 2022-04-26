package creditCardhandler;

import Factory.AmericanExpressCard;
import Factory.CreditCard;
import Factory.InvalidCreditCard;

public class AmericanExpressCardHandler implements CreditCardHandler {
	
	public CreditCardHandler next = null;

	public boolean handleNumber(long ccNumber) {
		
		String temp = String.valueOf(ccNumber);
		boolean isValid = false;
		
		if(temp != null && temp.length() == 15 && temp.charAt(0) == '3' && (temp.charAt(1) == '4' || temp.charAt(1) == '7')){
			
			isValid = true;
		}
		else if(next != null) {
			isValid= next.handleNumber(ccNumber);
		}
		else {
			new InvalidCreditCard(ccNumber);
		}
		
		return isValid;
		
	}

	public void setNext(CreditCardHandler next) {
		this.next = next;
	}

}
