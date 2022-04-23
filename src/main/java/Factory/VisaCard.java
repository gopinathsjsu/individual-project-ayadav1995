package Factory;

import utilities.Constants;

public class VisaCard extends CreditCard{

	public VisaCard(long cardNumber) {
		
		super(cardNumber,Constants.visa,Constants.noError);
	}
}
