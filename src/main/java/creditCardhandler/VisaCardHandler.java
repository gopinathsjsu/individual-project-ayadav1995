package creditCardhandler;

import Factory.CreditCard;
import Factory.InvalidCreditCard;
import Factory.VisaCard;

public class VisaCardHandler implements CreditCardHandler{

	public CreditCardHandler next = null;
	
	public boolean handleNumber(long ccNumber) {

		boolean isValid = false;
		String temp = String.valueOf(ccNumber);
		CreditCard card = null;
		
		if(temp != null && temp.charAt(0) == '4' && (temp.length() == 13 || temp.length() == 16)){
			card = new VisaCard(ccNumber);
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
