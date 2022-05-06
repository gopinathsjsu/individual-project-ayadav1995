package bean;

public class FlightDetails {

    private String flightNum;
    private String departureCity;
    private String arrivalCity;
    private int ecoSeats;
    private int busSeats;
    private int pecoSeats;
    private int ecoSeatsCost;
    private int busSeatsCost;
    private int pecoSeatsCost;

    public FlightDetails() {
    }

    public FlightDetails(String flightNum, String departureCity, String arrivalCity) {
        this.flightNum = flightNum;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    private FlightDetails(FlightDetailsBuilder flightDetails){

        this.flightNum = flightDetails.flightNum;
        this.departureCity = flightDetails.departureCity;
        this.arrivalCity = flightDetails.arrivalCity;
        this.ecoSeats= flightDetails.ecoSeats;
        this.busSeats= flightDetails.busSeats;
        this.pecoSeats= flightDetails.pecoSeats;
        this.ecoSeatsCost= flightDetails.ecoSeatsCost;
        this.busSeatsCost=flightDetails.busSeatsCost;
        this.pecoSeatsCost= flightDetails.pecoSeatsCost;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public int getEcoSeats() {
        return ecoSeats;
    }

    public void setEcoSeats(int ecoSeats) {
        this.ecoSeats = ecoSeats;
    }

    public int getBusSeats() {
        return busSeats;
    }

    public void setBusSeats(int busSeats) {
        this.busSeats = busSeats;
    }

    public int getPecoSeats() {
        return pecoSeats;
    }

    public void setPecoSeats(int pecoSeats) {
        this.pecoSeats = pecoSeats;
    }

    public int getEcoSeatsCost() {
        return ecoSeatsCost;
    }

    public void setEcoSeatsCost(int ecoSeatsCost) {
        this.ecoSeatsCost = ecoSeatsCost;
    }

    public int getBusSeatsCost() {
        return busSeatsCost;
    }

    public void setBusSeatsCost(int busSeatsCost) {
        this.busSeatsCost = busSeatsCost;
    }

    public int getPecoSeatsCost() {
        return pecoSeatsCost;
    }

    public void setPecoSeatsCost(int pecoSeatsCost) {
        this.pecoSeatsCost = pecoSeatsCost;
    }





    // Implementing Builder Design Pattern
    public static class FlightDetailsBuilder{
        private String flightNum;
        private String departureCity;
        private String arrivalCity;
        private int ecoSeats;
        private int busSeats;
        private int pecoSeats;
        private int ecoSeatsCost;
        private int busSeatsCost;
        private int pecoSeatsCost;


        public FlightDetailsBuilder flightNum(String flightNum) {
            this.flightNum = flightNum;
            return this;
        }

        public FlightDetailsBuilder departureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }

        public FlightDetailsBuilder arrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }

        public FlightDetailsBuilder ecoSeats(int ecoSeats) {
            this.ecoSeats = ecoSeats;
            return this;
        }

        public FlightDetailsBuilder busSeats(int busSeats) {
            this.busSeats = busSeats;
            return this;
        }
        public FlightDetailsBuilder pecoSeats(int pecoSeats) {
            this.pecoSeats = pecoSeats;
            return this;
        }
        public FlightDetailsBuilder ecoSeatsCost(int ecoSeatsCost) {
            this.ecoSeatsCost = ecoSeatsCost;
            return this;
        }
        public FlightDetailsBuilder busSeatsCost(int busSeatsCost) {
            this.busSeatsCost = busSeatsCost;
            return this;
        }
        public FlightDetailsBuilder pecoSeatsCost(int pecoSeatsCost) {
            this.pecoSeatsCost = pecoSeatsCost;
            return this;
        }


        public FlightDetails build(){
            validateItem();
            return new FlightDetails(this);
        }
        private void validateItem() {
            if (this.flightNum == null ) {
                throw new RuntimeException("Value can not be null");
            }

        }
    }
}
