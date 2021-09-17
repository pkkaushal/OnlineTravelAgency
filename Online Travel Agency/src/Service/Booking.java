package Service;

import Models.Customer;
import Models.Flight;
import Models.Seattype;

public interface Booking {

	public void addFlightsInfo();
	
	public void AvailableFlights(String origin, String destination);
	
	public Flight getFlightDetails(int flightNumber);
	
	public void bookSeat(int flightNumber, Customer cust, Seattype seat_type);
	
}
