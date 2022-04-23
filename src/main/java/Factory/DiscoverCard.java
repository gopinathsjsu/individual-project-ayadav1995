package Factory;

import utilities.Constants;

public class DiscoverCard extends CreditCard{
	
	public DiscoverCard(long cardNumber) {
		
		super(cardNumber,Constants.discover,Constants.noError);
	}
}
