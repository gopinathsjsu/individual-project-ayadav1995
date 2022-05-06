package tests;


import bean.CardDetails;
import creditCardhandler.AmericanExpressCardHandler;
import creditCardhandler.CreditCardHandler;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertTrue;

public class AmericanExpressCardHandlerTest {
	
	protected CardDetails checkCard = new CardDetails();
	
	@Before
    public void setUp() {
        checkCard.setCardNumber(Long.parseLong("340000000001995"));
    }

    @Test
    public void amexTest() {
    	CreditCardHandler aeh = new AmericanExpressCardHandler();
    	boolean testValue = aeh.handleNumber(checkCard.getCardNumber());
        assertTrue(testValue);
    }

}
