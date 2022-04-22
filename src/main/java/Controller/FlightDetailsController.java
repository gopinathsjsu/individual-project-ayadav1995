package Controller;

import bean.FlightDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FlightDetailsController {

    List<FlightDetails> flights;

    public void initializeFlights(List<FlightDetails> flightDetailsList){


        // we will take out the same flight and store the data as
        // <flightNumber , <map of seatCategory and a list of availableSeats,cost> >
        HashMap<String , HashMap<String,List<Integer> >> flights = new HashMap<>() ;


        for(FlightDetails f : flightDetailsList){

                    flights.put(f.getFlightNum(),
                            new HashMap<String,List<Integer>>()
                            {
                                {
                                    put("Economy",
                                            new ArrayList<>(Arrays.asList(f.getEcoSeats(),f.getEcoSeatsCost())));
                                    put("Premium Economy",
                                            new ArrayList<>(Arrays.asList(f.getPecoSeats(),f.getPecoSeatsCost())));
                                    put("Business",
                                            new ArrayList<>(Arrays.asList(f.getBusSeats(),f.getBusSeatsCost())));

                                }});

        }

        // code to iterate over the flightDetailsList obtained from the csvHandler class and create our hashmap of flights

    }

    // method to calculate the cost of bookings
    // Also edit the hashMap database when a certain booking is made, just get the seat type and reduce
    // the number of available seats by 1




}
