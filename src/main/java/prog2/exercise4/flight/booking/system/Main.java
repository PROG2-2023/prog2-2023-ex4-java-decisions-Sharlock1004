package prog2.exercise4.flight.booking.system;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        String sdepart = "2023-03-12";
        LocalDate departingData = LocalDate.parse(sdepart);
        String sreturn = "2023-03-14";
        LocalDate returnData = LocalDate.parse(sreturn);
        String sourceAirport="NANJING LUKOU INTERNATIONAL AIRPORT";
        String destinationAirport="OULU AIRPORT";
        String random="FOF"+Math.random();
        String substring = random.substring(random.length()-4);
        



        FlightBooking fb = new FlightBooking("John Doe", departingData, returnData, 1, 3);
        fb.setTripSource("NANJING");
        fb.setTripDestination("OULU");
        fb.setDepartingDate(LocalDate.parse("2023-03-12"));
        fb.setReturnDate(LocalDate.parse("2023-03-14"));
        fb.setFlightCompany("Flights-of-Fancy");
        fb.setTicketNumber("MU759435");
        fb.setTotalTicketPrice(5500);
        fb.setTotalPassengers(1, 3);
        
        System.out.println("Dear " + fb.getPassengerFullName() + ". Thank for booking your flight with " +
                fb.getFlightCompany() + ".\n Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + fb.getTicketNumber() + "\n" +
                "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
                "Data of departure: " + fb.getDepartingDate() + "\n" +
                "Data of return: " + fb.getReturnDate() + "\n" +
                "Total passengers: " + fb.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " );
        
    }
}
