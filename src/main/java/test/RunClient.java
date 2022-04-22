package test;

import Controller.FlightDetailsController;
import bean.FlightDetails;
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


        // call methods to read data from the flightDetailsFile
        FileParser parser = new FileParser();
        CsvHandler handler = parser.getFileParser(flightDetailsFilePath,bookingRequestsFilePath,bookedFlightsFilePath,incorrectBookingsFilePath);


        if(handler != null) {

            List<FlightDetails> inputList = handler.handleFlightDetailsFile(flightDetailsFilePath);

            for(FlightDetails f : inputList){
                System.out.println(f.getArrivalCity());
            }

            FlightDetailsController flightDetailsController = new FlightDetailsController();
            flightDetailsController.initializeFlights(inputList);
        }
//         call methods to initialise the data for the files using the map

    }

}
