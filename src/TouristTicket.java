public class TouristTicket extends Ticket {
    public String hotelAddress;
    public String[] selectedTouristLocation;

    // Constructor when passing all the details.

    public TouristTicket(String pnr, String from, String to, Flight flight, String arrivalDateTime,
                         String departureDateTime, Passenger passenger, String seatNo, float price,
                         boolean cancelled,String hotelAddress,String[] selectedTouristLocation) {
        super(pnr, from, to, flight, arrivalDateTime, departureDateTime, passenger, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }
    // Constructor when passing ticket object.
    public TouristTicket(Ticket ticket,String hotelAddress,String[] selectedTouristLocation) {
        super(ticket.pnr,ticket.getFrom(),ticket.getTo(),ticket.getFlight(),ticket.getArrivalDateTime(),
                ticket.getDepartureDateTime(), ticket.getPassenger(),ticket.getSeatNo(),ticket.getPrice(),
                ticket.isCancelled());

        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress(){
                return hotelAddress;
        }
        public String[] getTouristLocation(){
            return selectedTouristLocation;
        }
    public void printTicketDetails(){
        System.out.println(super.getPnr());

    }

    public void printHotelDetails(){
        System.out.println(hotelAddress);

    }
}
