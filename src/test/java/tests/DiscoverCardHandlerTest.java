package tests;


import bean.CardDetails;
import creditCardhandler.CreditCardHandler;
import creditCardhandler.DiscoverCardHandler;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertTrue;

public class DiscoverCardHandlerTest {

	protected CardDetails checkCard = new CardDetails();
	
	@Before
    public void setUp() {
		
        checkCard.setCardNumber(Long.parseLong("6011000000001997"));

    }

    @Test
    public void discoverTest() {
    	
    	CreditCardHandler aeh = new DiscoverCardHandler();
    	boolean testValue = aeh.handleNumber(checkCard.getCardNumber());
        assertTrue(testValue);
    }
}
