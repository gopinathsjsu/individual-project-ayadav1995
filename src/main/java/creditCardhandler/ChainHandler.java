package creditCardhandler;

import bean.CardDetails;


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
		

		isValid = ah.handleNumber(cardDetails.getCardNumber());

		
		return isValid;
	}

}
