package utilities;


import bean.BookingDetails;
import bean.BookingRequest;
import bean.FlightDetails;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CsvHandler {
	
	public List<FlightDetails> handleFlightDetailsFile(String flightDetailsFilePath) {
		
//		String csvFile = Constants.dirPath + ipFileName;
		String pattern = "MM/DD/YYYY";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		BufferedReader br = null;
		String line = "";
		String splitOperator = ",";
		List<FlightDetails> list = new ArrayList<FlightDetails>();
		
		try {
			
			br = new BufferedReader(new FileReader(flightDetailsFilePath));
			while ((line = br.readLine()) != null) {
				
				if(!line.startsWith("Category")) {

					FlightDetails flight = null;
					String[] flightDetails = line.split(splitOperator);
					
					try {

						// will call the initializeFlights method from flightController here
						// that class will be a singleton class and as each time the method is called we will
						// update the same object of
						if(!list.isEmpty()){
							for(FlightDetails f : list){

								if(f.getFlightNum() == flightDetails[1]){
									flight = f;
									break;
								}else{
									flight = new FlightDetails();
								}
							}
						}else{
							flight = new FlightDetails();
						}




						if(flightDetails[0].equalsIgnoreCase("Economy")){

							flight.setEcoSeats(Integer.parseInt(flightDetails[2]));
							flight.setEcoSeatsCost(Integer.parseInt(flightDetails[3]));

						}else if(flightDetails[0].equalsIgnoreCase ("Business")){
							flight.setBusSeats(Integer.parseInt(flightDetails[2]));
							flight.setBusSeatsCost(Integer.parseInt(flightDetails[3]));

						}else if(flightDetails[0].equalsIgnoreCase("Premium Economy") ){
							flight.setPecoSeats(Integer.parseInt(flightDetails[2]));
							flight.setPecoSeatsCost(Integer.valueOf(flightDetails[3]));
						}

						flight.setFlightNum(flightDetails[1]);
						flight.setArrivalCity(flightDetails[4]);
						flight.setDepartureCity(flightDetails[5]);

						
					}
					catch(NumberFormatException nfe) {
						
					}
//					catch(ParseException pe) {
//
//					}
					list.add(flight);
				}
			}
			
		}
		catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
            e.printStackTrace();
        } 
		catch (IOException e) {
            e.printStackTrace();
        } 
		finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		return list;
	}

	public List<BookingRequest> handleBookingRequestsFile(String bookingRequestFilePath) {

//		String csvFile = Constants.dirPath + ipFileName;
		String pattern = "MM/DD/YYYY";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		BufferedReader br = null;
		String line = "";
		String splitOperator = ",";
		List<BookingRequest> list = new ArrayList<BookingRequest>();

		try {

			br = new BufferedReader(new FileReader(bookingRequestFilePath));
			while ((line = br.readLine()) != null) {

				if(!line.startsWith("BookingName")) {

					BookingRequest booking = new BookingRequest();
					String[] bookingRequest = line.split(splitOperator);

					try {

						booking.setName(bookingRequest[0]);
						booking.setFlightNum(bookingRequest[1]);
						booking.setCategory(bookingRequest[2]);
						booking.setNumberOfSeats(Integer.parseInt(bookingRequest[3]));
						booking.setCardNumber(Long.parseLong(bookingRequest[4]));
//
					}
					catch(NumberFormatException nfe) {

					}
//					catch(ParseException pe) {
//
//					}
					list.add(booking);
				}
			}

		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return list;
	}


}
