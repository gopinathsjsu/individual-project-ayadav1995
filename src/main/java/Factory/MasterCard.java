package Factory;

import utilities.Constants;

public class MasterCard extends CreditCard{

	public MasterCard(long cardNumber) {
		
		super(cardNumber,Constants.masterCard,Constants.noError);
	}
}
