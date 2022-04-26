package creditCardhandler;

import Factory.CreditCard;
import bean.BookingRequest;

public interface CreditCardHandler {

	boolean handleNumber(long ccNumber);
	void setNext(CreditCardHandler next);
}
