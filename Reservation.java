package miniproject;

public class Reservation {

	    private int reservationId;
	    private String username;
	    private String flightNumber;

	    public Reservation(int reservationId, String username, String flightNumber) {
	        this.reservationId = reservationId;
	        this.username = username;
	        this.flightNumber = flightNumber;
	    }

	    public int getReservationId() {
	        return reservationId;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getFlightNumber() {
	        return flightNumber;
	    }
}
