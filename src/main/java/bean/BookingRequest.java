package bean;

public class BookingRequest {

    private String name;
    private String Category;
    private int numberOfSeats;
    private long cardNumber;
    private String flightNum;

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
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BookingRequest() {
    }

    public BookingRequest(String name, String flightNum, String category, int numberOfSeats, long cardNumber) {
        this.name = name;
        this.flightNum = flightNum;
        Category = category;
        this.numberOfSeats = numberOfSeats;
        this.cardNumber = cardNumber;
    }




}
