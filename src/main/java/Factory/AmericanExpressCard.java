package Factory;


import utilities.Constants;

public class AmericanExpressCard extends CreditCard{

	public AmericanExpressCard(long cardNumber) {
		
		super(cardNumber, Constants.americanExpress,Constants.noError);
	}
}
