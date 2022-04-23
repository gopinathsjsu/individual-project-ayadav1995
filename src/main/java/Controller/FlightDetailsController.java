package Controller;

import bean.BookingDetails;
import bean.BookingRequest;
import bean.FlightDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FlightDetailsController {

//    List<FlightDetails> flights;
    HashMap<String , HashMap<String,List<Integer> >> flights;

    public void initializeFlights(List<FlightDetails> flightDetailsList){


        // we will take out the same flight and store the data as
        // <flightNumber , <map of seatCategory and a list of availableSeats,cost> >
         flights = new HashMap<>() ;


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


    public List<BookingDetails> validateBooking(List<BookingRequest> bookingRequests){

        List<BookingDetails> bookingDetailsist = new ArrayList<>();
        boolean isBookingValid = true;

        if(!bookingRequests.isEmpty()){

            for(BookingRequest bookingRequest : bookingRequests){

                BookingDetails bookingDetails = new BookingDetails();

                //check if the flight is a valid flight
                if(flights.containsKey(bookingRequest.getFlightNum())){

                    //check if the number of requested seats are valid (i.e less than or equal to available seats)
                    if(bookingRequest.getCategory().equals("Economy")){

                        bookingDetails = validateBooking(bookingRequest, "Economy");

                        if(bookingDetails != null){
                            bookingDetailsist.add(bookingDetails);
                        }

                       }
                    if(bookingRequest.getCategory().equals("Premium Economy")){
                        bookingDetails = validateBooking(bookingRequest, "Premium Economy");

                        if(bookingDetails != null){
                            bookingDetailsist.add(bookingDetails);
                        }
                    }
                    if(bookingRequest.getCategory().equals("Business")){
                        bookingDetails = validateBooking(bookingRequest, "Business");

                        if(bookingDetails != null){
                            bookingDetailsist.add(bookingDetails);
                        }
                    }

                }else
                    isBookingValid = false;

            }

        }


        return bookingDetailsist;
    }

    public BookingDetails validateBooking(BookingRequest bookingRequest ,String category){
        BookingDetails bookingDetails = new BookingDetails();

        if(flights.get(bookingRequest.getFlightNum()).containsKey(category)) {
//                                  int availableSeats = flights.get(bookingRequest.getFlightNum()).get("Economy").get(0);
            if(flights.get(bookingRequest.getFlightNum()).get(category).get(0) <= bookingRequest.getNumberOfSeats()){

                // now that flight is valid and has enough seats we calculate the total cost
                bookingDetails.setTotalPrice(flights.get(bookingRequest.getFlightNum()).get(category).get(1) * bookingRequest.getNumberOfSeats() );


                //after calculating the cost we need to check if the card number is valid
                // we will call the cardValidation methods from here
                if(true){
                    //After the card validation we will add the booking details in the booking details object
                    bookingDetails.setFlightNum(bookingRequest.getFlightNum());
                    bookingDetails.setCategory(bookingRequest.getCategory());
                    bookingDetails.setName(bookingRequest.getName());
                    bookingDetails.setNumberOfSeats(bookingRequest.getNumberOfSeats());


                    // after the booking is made we need to reduce the booked number of seats from the category for that flight
                    flights.get(bookingRequest.getFlightNum()).get(category).set(0,flights.get(bookingRequest.getFlightNum()).get(category).get(0) -bookingDetails.getNumberOfSeats() ) ;




                }else{
                    return null;
                }


            }else{
                return null;
            }

        }

        return bookingDetails;
    }


}
