package utilities;

public class FileParser {
	
	public CsvHandler getFileParser(String flightDetailsFilePath, String bookingRequestsPath,String bookedFlightsFilePath, String incorrectBookingsFilePath){
		
		CsvHandler fh = null;


		if(flightDetailsFilePath != null && flightDetailsFilePath.endsWith("csv") && bookedFlightsFilePath.endsWith("csv") && bookingRequestsPath.endsWith("csv") && incorrectBookingsFilePath.endsWith("txt")) {
			fh = new CsvHandler();
		}
		else {
			System.out.println(" File formats did not match!");
		}
		
		return fh;
	}

}
