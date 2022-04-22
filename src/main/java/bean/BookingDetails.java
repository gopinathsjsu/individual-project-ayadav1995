package bean;

public class BookingDetails {

    private String name;
    private String flightNum;
    private String category;
    private int numberOfSeats;
    private int totalPrice;


    public BookingDetails(String name, String flightNum, String category, int numberOfSeats, int totalPrice) {
        this.name = name;
        this.flightNum = flightNum;
        this.category = category;
        this.numberOfSeats = numberOfSeats;
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }







}
