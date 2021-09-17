package Controller;
import java.util.*;

import Models.Customer;
import Models.Flight;
import Models.Seattype;
import Service.BookingImpl;
import Service.Booking;
public class Main {
	
	
	public static void main(String[] args) {
		 Booking booking = new BookingImpl();
        Flight flight;
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
       
        String input, destination, origin, name;
        int Flight_number, age;
       
        boolean close = false;

        while (close != true) {
        	
            System.out.println("Enter addInfo if you would like to book a flight");
            System.out.println("---------------------------------------------------------------");
            System.out.println();
            
            System.out.println("Enter display if you would like to display all flights");
            System.out.println("---------------------------------------------------------------");
            System.out.println();
            
            System.out.println("Enter GetInfo if you would like to get information on a flight");
            System.out.println("---------------------------------------------------------------");
            System.out.println();
            
            System.out.println("Enter book if you would like to book a seat");
            System.out.println("---------------------------------------------------------------");
            System.out.println();
            
            System.out.println("Enter Close if you would like to Close the Info_System");
            System.out.println("---------------------------------------------------------------");
            
            input = sc1.nextLine();
            System.out.println();
            
            switch (input) {
                case "addInfo":
                    booking.addFlightsInfo();
                    break;
                case "display":
                    System.out.println("Enter flight origin\t");
                    System.out.println();
                    origin = sc1.nextLine();
                    
                    
                    System.out.println("Enter flight destination\t");
                    System.out.println();
                    destination = sc1.nextLine();
                    
                    
                    booking.AvailableFlights(origin, destination);
                    break;
                case "GetInfo":
                    System.out.println("Enter Flight number\t");
                    Flight_number = sc2.nextInt();
                    System.out.println();
                    
                    flight = booking.getFlightDetails(Flight_number);
                    if (flight == null) {
                        
                    	System.out.println("Flight " + Flight_number + "is not available from mentioned details");
                    	System.out.println();
                    } else {
                        System.out.println("Deatils of the flight " + Flight_number + ":");
                        
                        System.out.println(flight);
                        System.out.println();
                    }
                    break;
                case "book":
                    
                    System.out.println("Enter passengers age\t");
                    System.out.println();
                    age = sc2.nextInt();
                    
                    
                    System.out.println("Enter passengers name\t");
                    System.out.println();
                    name = sc1.nextLine();
                   
                    
                    System.out.println("Enter flight number\t");
                    System.out.println();
                    Flight_number = sc2.nextInt();
                   
                    
                    System.out.println("Enter Seat preference: Economy or Business\t");
                    System.out.println();
                    String type= sc1.nextLine();
                   
                    
                    Customer cust=new Customer(name,age);
                    if(type.equals("Business"))
                    {
                    	 Seattype seattype=Seattype.BUSINESS;
                    
                        booking.bookSeat(Flight_number, cust, seattype);

                    }
                    else if(type.equals("Economy"))
                    {
                    	 Seattype seattype=Seattype.ECONOMY;
                         
                         booking.bookSeat(Flight_number, cust, seattype);
                    }
                    break;
                case "Close":
                    close = true;
                    System.out.println("Program is terminated");
                    System.out.println("-----------------------------------------------");
                    break;
                default:
                    System.out.println("This is not a valid input");
                    System.out.println("-----------------------------------------------");
                    break;

            }

        }
        sc1.close();
        sc2.close();

    }

}
