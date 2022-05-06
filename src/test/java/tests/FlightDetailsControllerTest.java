package tests;

import Controller.FlightDetailsController;
import bean.BookingDetails;
import bean.BookingRequest;
import bean.FlightDetails;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

public class FlightDetailsControllerTest extends TestCase {
    FlightDetailsController flightDetailsController;
    FlightDetails flight;
    List<FlightDetails> flights;
    BookingRequest bookingRequest;
    @Before
    public void setUp() {
//        Economy,SJ456,5,250,Seattle,San Jose
        flight = new FlightDetails();
        flight.setFlightNum("SJ456");
        flight.setEcoSeats(5);
        flight.setEcoSeatsCost(250);
        flight.setDepartureCity("Seattle");
        flight.setArrivalCity("Seattle");

        flights = new ArrayList<>();
        flights.add(flight);

//        Sam,SJ456,Economy,2,5410000000000000
         bookingRequest = new BookingRequest();
        bookingRequest.setName("Sam");
        bookingRequest.setFlightNum("SJ456");
        bookingRequest.setCategory("Economy");
        bookingRequest.setNumberOfSeats(2);
        bookingRequest.setCardNumber(5410000000000000L);

    }

    @Test
    public void testValidateBooking() {


        boolean testResult= false;
        BookingDetails bookingDetails = new BookingDetails();

        flightDetailsController = FlightDetailsController.getInstance();

        flightDetailsController.initializeFlights(flights);

        bookingDetails =  flightDetailsController.validateBooking(bookingRequest,"Economy");

//        System.out.println(bookingDetails.getName());
//        System.out.println(bookingRequest.getName());
        if(bookingDetails.getName().equals(bookingRequest.getName())
            && bookingDetails.getNumberOfSeats() == bookingRequest.getNumberOfSeats()
            && bookingDetails.getFlightNum().equals( bookingRequest.getFlightNum())
        ){
            testResult = true;
        }

        assertTrue(testResult);

    }


}