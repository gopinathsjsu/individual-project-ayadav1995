package test;

import Controller.FlightDetailsController;
import Factory.CreditCard;
import bean.BookingDetails;
import bean.BookingRequest;
import bean.FlightDetails;
import creditCardhandler.ChainHandler;
import utilities.CsvHandler;
import utilities.FileParser;

import java.util.List;

public class RunClient {

    public static void main(String[] args) {


        /* get the arguments from the maven run. the args will be
            1. booking Requests
            2. flightDetails
            3. output file for correct bookings
            4. output file for incorrect bookings
         */

        String bookingRequestsFilePath = args[0];
        String flightDetailsFilePath = args[1];
        String bookedFlightsFilePath = args[2];
        String incorrectBookingsFilePath = args[3];

//        String bookingRequestsFilePath = "src\\test\\inputFiles\\BookingRequests.csv";
//        String flightDetailsFilePath = "src\\test\\inputFiles\\FlightDetails.csv";
//        String bookedFlightsFilePath = "src\\test\\inputFiles\\BookedFlights.csv";
//        String incorrectBookingsFilePath = "src\\test\\inputFiles\\Output.txt";


        // call methods to read data from the flightDetailsFile
        FileParser parser = new FileParser();
        CsvHandler handler = parser.getFileParser(flightDetailsFilePath,bookingRequestsFilePath,bookedFlightsFilePath,incorrectBookingsFilePath);


        if(handler != null) {

            List<FlightDetails> inputList = handler.handleFlightDetailsFile(flightDetailsFilePath);

            //just to test if read from CSV works
//            for(FlightDetails f : inputList){
//                System.out.println(f.getArrivalCity());
//            }

            //    call methods to initialise the data for the files using the map
            FlightDetailsController flightDetailsController = FlightDetailsController.getInstance();
            flightDetailsController.initializeFlights(inputList);

            List<BookingRequest> bookingRequests = handler.handleBookingRequestsFile(bookingRequestsFilePath);

            List<BookingDetails> bookingDetails = flightDetailsController.validateBooking(bookingRequests);

            for(BookingDetails b: bookingDetails){
                System.out.println(b.getName());
                System.out.println(b.getTotalPrice());
            }

            handler.writeBookedFlightsFile(bookingDetails, bookedFlightsFilePath);

           List<String> invalidBookings= flightDetailsController.getInvalidBookings();

            handler.writeInvalidBookingsFile(invalidBookings, incorrectBookingsFilePath);





        }



    }

}
