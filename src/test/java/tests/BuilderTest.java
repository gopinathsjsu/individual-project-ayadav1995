package tests;

import bean.CardDetails;
import bean.FlightDetails;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class BuilderTest {

    protected CardDetails checkCard = new CardDetails();

    @Before
    public void setUp() {

    }

    @Test
    public void builderTest() {

         String flightNum = "BY101";
         String departureCity = "London";
         String arrivalCity = "San Jose";
         int ecoSeats = 2;
         int busSeats=2;
         int pecoSeats=2;
         int ecoSeatsCost=200;
         int busSeatsCost=400;
         int pecoSeatsCost=300;

        FlightDetails flightDetails ;
        flightDetails = new FlightDetails.FlightDetailsBuilder().flightNum(flightNum).ecoSeats(ecoSeats).busSeats(busSeats).
                pecoSeats(pecoSeats).ecoSeatsCost(ecoSeatsCost).busSeatsCost(busSeatsCost).
                pecoSeatsCost(pecoSeatsCost).
                arrivalCity(arrivalCity).departureCity(departureCity).build();

        // checking that the object was correctly created. We can check all fields as well
        assertTrue(flightDetails.getFlightNum().equals(flightNum));

    }

}
