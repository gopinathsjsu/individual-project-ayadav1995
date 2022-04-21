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








}
