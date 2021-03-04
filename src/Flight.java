public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

//getters and setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }



        public String getFlightDetails(){
            return this.flightNumber + ";" + this.airline;
        }
        public boolean checkAvailability(){
            if (capacity-bookedSeats>0){
                return true;
            }
            else {
                return false;
            }
        }
        public void incrementBookingCounter(){
            bookedSeats++;
        }
}
