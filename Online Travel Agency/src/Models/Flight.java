package Models;

public class Flight {

	
	private int fligh_tNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsleft;
    private double originalPrice;
    
    
	
	
	 

	public Flight(int flight_num, String origin, String destination, String departuretime, int capacity,
			double original_price) {
		// TODO Auto-generated constructor stub
		super();
		this.fligh_tNumber = flight_num;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departuretime;
		this.capacity = capacity;
		this.numberOfSeatsleft = capacity;
		this.originalPrice = original_price;
	}



	public boolean bookASeat() {
	        if (numberOfSeatsleft > 0) {
	            numberOfSeatsleft = numberOfSeatsleft - 1;
	            return true;

	        }
	        return false;
	    }


	public int getFligh_tNumber() {
		return fligh_tNumber;
	}


	public void setFligh_tNumber(int fligh_tNumber) {
		this.fligh_tNumber = fligh_tNumber;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int getNumberOfSeatsleft() {
		return numberOfSeatsleft;
	}


	public void setNumberOfSeatsleft(int numberOfSeatsleft) {
		this.numberOfSeatsleft = numberOfSeatsleft;
	}


	public double getOriginalPrice() {
		return originalPrice;
	}


	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	@Override
	public String toString() {
		return "Flight [fligh_tNumber=" + fligh_tNumber + ", origin=" + origin + ", destination=" + destination
				+ ", departureTime=" + departureTime + ", capacity=" + capacity + ", numberOfSeatsleft="
				+ numberOfSeatsleft + ", originalPrice=" + originalPrice + "]";
	}
    
	
    
    
}
