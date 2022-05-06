package tests;


import bean.CardDetails;
import creditCardhandler.CreditCardHandler;
import creditCardhandler.VisaCardHandler;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VisaCardHandlerTest {
	
	protected CardDetails checkCard = new CardDetails();
	
	@Before
    public void setUp() {
		
        checkCard.setCardNumber(Long.parseLong("4243000000000000"));

    }

    @Test
    public void visaTest() {
    	
    	CreditCardHandler cch = new VisaCardHandler();
    	boolean testValue = cch.handleNumber(checkCard.getCardNumber());
        assertTrue(testValue);
    }

}
