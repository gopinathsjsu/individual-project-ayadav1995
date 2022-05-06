package tests;


import bean.CardDetails;
import creditCardhandler.CreditCardHandler;
import creditCardhandler.MasterCardHandler;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

public class MasterCardHandlerTest {

	protected CardDetails checkCard = new CardDetails();
	
	@Before
    public void setUp() {
		
        checkCard.setCardNumber(Long.parseLong("5210000000000000"));

    }

    @Test
    public void masterCardTest() {
    	
    	CreditCardHandler cch = new MasterCardHandler();
    	boolean testValue = cch.handleNumber(checkCard.getCardNumber());
        assertTrue(testValue );
    }
}
