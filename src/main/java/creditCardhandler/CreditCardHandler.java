package creditCardhandler;

import Factory.CreditCard;

public interface CreditCardHandler {

	CreditCard handleNumber(long ccNumber);
	void setNext(CreditCardHandler next);
}
