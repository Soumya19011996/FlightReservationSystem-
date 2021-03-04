import java.sql.Array;
import java.sql.SQLOutput;

public class Start {
    public static void main (String[] args){

        //Creating a new passenger object
        Passenger Somu = new Passenger(1,"Lane1","BLR","Karnataka","SOumya",
        "9989999889","Soumya@gmail.com");

        Passenger Ramu = new Passenger(2,"Lane1","BLR","Karnataka","SOumya",
                "9989999343","Soumya@gmail.com");

        //Checking the total number of passengers
        System.out.println(Ramu.getContact().getPhone());

        System.out.println(Passenger.getCount());

        // Creating a new Flight object
        Flight INDG0012 = new Flight("1234drf56","Indigo",100,80);

        // Creating ticket1 by passing all the values explicitly to the constructor
        Ticket ticket1 = new Ticket("1022669", "BLR","PUN",INDG0012,"7:10","7:10",
                Somu, "6A",450,false);
        //System.out.println(ticket_1.getArrivalDateTime());


        RegularTicket regularTicket = new RegularTicket("1000100","BLR","pun",INDG0012,"5.10",
                "8.15",Somu,"15B",350,false,"Meals has to be provided");

        //Second way of creating a regular ticket1. This constructor takes ticket1 object and only special service as parameters.

        RegularTicket regularTicket2 = new RegularTicket(ticket1,"Extra legroom has to be provided");

        // Creating cities string array to use in creation of tourist ticket1

        String [] cities = {"California","NewYork","Deloite","Albequerque","Alabama"};

        TouristTicket touristTicket = new TouristTicket("1000200","BLR","pun",INDG0012,"5.10",
                "8.15",Somu,"15B",350,false,"Hotel California",cities);



        //Second way of creating a regular ticket2. This constructor takes ticket1 object and only special service as parameters.
        TouristTicket touristTicket2 = new TouristTicket(ticket1,"Hotel NewYork",cities);

        regularTicket.printTicketDetails();// Printing pnr
        touristTicket.printTicketDetails();// Printing pnr
        regularTicket2.getSpecialService();// Printing special service in regular ticket
        touristTicket2.printHotelDetails();// Printing hotel details in tourist tickets
    }

}
