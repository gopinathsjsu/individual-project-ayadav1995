package tests;

import Controller.FlightDetailsController;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class SingletonTest {


    @Before
    public void setUp() {

    }

    @Test
    public void singetonTest() {

        FlightDetailsController object1 = FlightDetailsController.getInstance();
        FlightDetailsController object2 = FlightDetailsController.getInstance();


        assertTrue(object1== object2);

    }

}
