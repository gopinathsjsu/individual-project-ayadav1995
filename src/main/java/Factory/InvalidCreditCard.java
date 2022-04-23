package Factory;

import utilities.Constants;

public class InvalidCreditCard extends CreditCard{
	
	public InvalidCreditCard(long ccNumber) {
		
		super(ccNumber,Constants.invalidCardType,Constants.error);
	}
}
