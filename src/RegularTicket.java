public class RegularTicket extends Ticket {
    public String specialService;

    // Constructor when passing all the details

  public RegularTicket(String pnr, String from, String to, Flight flight, String arrivalDateTime,
                 String departureDateTime, Passenger passenger, String seatNo, float price, boolean cancelled,String specialService) {
       super(pnr, from, to, flight, arrivalDateTime, departureDateTime, passenger, seatNo, price, cancelled);
       this.specialService = specialService;
   }

    // Constructor when passing ticket object.

    public RegularTicket(Ticket ticket,String specialService) {
        super(ticket.pnr,ticket.getFrom(),ticket.getTo(),ticket.getFlight(),ticket.getArrivalDateTime(),
                ticket.getDepartureDateTime(),ticket.getPassenger(),ticket.getSeatNo(),ticket.getPrice(),ticket.isCancelled());
        this.specialService = specialService;
    }

    public void getSpecialService() {
        System.out.println(specialService);
    }
    public void updateSpecialService(String specialService){
        this.specialService = specialService;
    }
    public void printTicketDetails(){
        System.out.println(super.getPnr());

    }

}
