package creditCardhandler;

public interface CreditCardHandler {

	boolean handleNumber(long ccNumber);
	void setNext(CreditCardHandler next);

}
