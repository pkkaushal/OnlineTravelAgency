package Models;

public class Seat {
	
	private Flight flight;
    private Customer customer;
    private double price;
    private int seat_number;
    private Seattype seat_type;
    private static int count = 0;
    
	public Seat(Flight flight, Customer customer, double price, int number,Seattype seat_type) {
		super();
		count++;
		this.flight = flight;
		this.customer = customer;
		
		if(seat_type==Seattype.BUSINESS)
		{
		this.price = 2.5*price;
		}
		else {
			this.price=price;
		}
	
		this.seat_number = number;
		this.seat_type=seat_type;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSeatNumber() {
		return seat_number;
	}

	public void setNumber(int number) {
		this.seat_number = number;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Seat.count = count;
	}

	public Seattype getSeat_type() {
		return seat_type;
	}

	public void setSeat_type(Seattype seat_type) {
		this.seat_type = seat_type;
	}

	@Override
	public String toString() {
		return "Seat [flight=" + flight + ", customer=" + customer + ", price=" + price + ", seat_number=" + seat_number
				+ ", seat_type=" + seat_type + "]";
	}
    
    
}
