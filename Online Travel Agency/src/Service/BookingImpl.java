package Service;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import Models.Customer;
import Models.Flight;
import Models.Seat;
import Models.Seattype;


public class BookingImpl implements Booking{
	
	 List<Flight> flights;
	 List<Seat> Seat;

	    public BookingImpl() {
	        flights = new ArrayList<Flight>();
	        Seat = new ArrayList<Seat>();

	    }

	    public void addFlightsInfo() {
	        int FlightNum,capacity;
	        double originalPrice;
	        String origin, destination, departureTime;
	        Scanner sc1 = new Scanner(System.in);
	        Scanner sc2 = new Scanner(System.in);
	        Scanner sc3 = new Scanner(System.in);
	        
	        System.out.println("Enter flight Number");
	        System.out.println();
	        FlightNum = sc1.nextInt();
	        
	        System.out.println("Enter flight origin");
	        origin = sc2.nextLine();
	        System.out.println();
	        
	        System.out.println("Enter flight destination");
	        destination = sc2.nextLine();
	        System.out.println();
	        
	        
	        System.out.println("Enter flight departure time");
	        departureTime = sc2.nextLine();
	        System.out.println();
	        
	        System.out.println("Enter flight capacity");
	        capacity = sc1.nextInt();
	        System.out.println();
	        
	        System.out.println("Enter original price of ticket");
	        originalPrice = sc3.nextDouble();
	        System.out.println();
	        
	        Flight flight = new Flight(FlightNum, origin, destination, departureTime, capacity, originalPrice);
	        flights.add(flight);
	        System.out.println("The following  flight info has been added");
	        System.out.println("---------------------------------------------------------");
	        System.out.println(flight);
	        
	       return;
	        

	    }
	    
	    public void AvailableFlights(String origin, String destination) {
	        int size, seats;
	        String orgn, dstn;
	        size = flights.size();
	        
	        if(size==0)
	        {
	        	System.out.println("no available flights with given info");
	        	System.out.println();
	        	System.out.println("----------------------------------------------------");
	        	return;
	        }
	        for (int i = 0; i < size; i++) {
	            orgn = flights.get(i).getOrigin();
	            dstn = flights.get(i).getDestination();
	            seats = flights.get(i).getNumberOfSeatsleft();
	            if ((orgn.equals(origin) == true) && (dstn.equals(destination) == true) && seats > 0) {
	               
	                    System.out.println("Total available flights:");
	             
	                System.out.println(flights.get(i));
	               
	            }
	        else {
	        
	        	System.out.println("no available flights with given info");
	           
	              }

	           }
	    }

	    public Flight getFlightDetails(int flightNumber) {
	        int size = flights.size();
	        for (int i = 0; i < size; i++) {
	            if (flights.get(i).getFligh_tNumber() == flightNumber) {
	                return flights.get(i);
	            }

	        }
	        return null;
	    }
	    
	    
	    public void bookSeat(int flightNumber, Customer cust, Seattype seat_type) {
	        int size = flights.size();
	        if(size==0)
	        {
	        	System.out.println("No flights available");
	        	return;
	        }
	        boolean flight_available = false;
	        int index = 0, seats;
	        for (int i = 0; i < size; i++) {
	            if (flights.get(i).getFligh_tNumber() == flightNumber ) {
	                flight_available = true;
	                index = i;
	                break;
	            }

	        }
	        double price;
	        
	        int capacity=flights.get(index).getCapacity();
	        int seat_number=(int)(Math.random()*capacity);
	        seats = flights.get(index).getNumberOfSeatsleft();
	        if (flight_available == true && (seats > 0)) {
	            flights.get(index).bookASeat();
	            price = flights.get(index).getOriginalPrice();
	         
	            Seat seat = new Seat(flights.get(index), cust, price,seat_number,seat_type);
	            Seat.add(seat);
	            System.out.println("succesfully booked a seat for flight " + flightNumber);
	            System.out.println("----------------------------------------------------------");
	            System.out.println("Seat: " + seat);



	        } else {
	            if (flight_available == true && seats == 0) {
	                System.out.println("The Flight " + flightNumber + " is full, Sorry for inconvenience");

	            } else if (flight_available == false) {
	                System.out.println("The Flight " + flightNumber + " does not exist");
	            }
	        }

	    }
	    
	    
	    
	

}
