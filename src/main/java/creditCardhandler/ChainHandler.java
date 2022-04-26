package creditCardhandler;

import bean.CardDetails;
import Factory.CreditCard;

import java.util.ArrayList;
import java.util.List;


public class ChainHandler {
	
	
	public boolean handleChain(CardDetails cardDetails) {
		
		boolean isValid = false;
		
		AmericanExpressCardHandler ah = new AmericanExpressCardHandler();
		DiscoverCardHandler dh = new DiscoverCardHandler();
		MasterCardHandler mh = new MasterCardHandler();
		VisaCardHandler vh = new VisaCardHandler();
		
		ah.setNext(dh);
		dh.setNext(mh);
		mh.setNext(vh);
		

			ah.handleNumber(cardDetails.getCardNumber());

		
		return isValid;
	}

}
