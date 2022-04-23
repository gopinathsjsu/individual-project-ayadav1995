package creditCardhandler;

import bean.CardDetails;
import Factory.CreditCard;
import bean.CardDetails;

import java.util.ArrayList;
import java.util.List;


public class ChainHandler {
	
	
	public List<CreditCard> handleChain(List<CardDetails> list) {
		
		List<CreditCard> result = new ArrayList<CreditCard>();
		
		AmericanExpressCardHandler ah = new AmericanExpressCardHandler();
		DiscoverCardHandler dh = new DiscoverCardHandler();
		MasterCardHandler mh = new MasterCardHandler();
		VisaCardHandler vh = new VisaCardHandler();
		
		ah.setNext(dh);
		dh.setNext(mh);
		mh.setNext(vh);
		
		for(CardDetails card : list) {
			result.add(ah.handleNumber(card.getCardNumber()));	
		}
		
		return result;
	}

}
