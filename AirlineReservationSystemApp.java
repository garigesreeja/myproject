package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class AirlineReservationSystemApp {
	
	    private static ArrayList<User> users = new ArrayList<>();
	    private static ArrayList<Reservation> reservations = new ArrayList<>();
	    private static int reservationIdCounter = 1;
	  
	    public static void newUserRegistration() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a new username: ");
	        String username = scanner.nextLine();
	        System.out.print("Enter a password: ");
	        String password = scanner.nextLine();

	        User newUser = new User(username, password);
	        users.add(newUser);

	        System.out.println("Registration successful!");
	    }

	    public static void login() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your username: ");
	        String username = scanner.nextLine();
	        System.out.print("Enter your password: ");
	        String password = scanner.nextLine();

	        User user = findUser(username);

	        if (user != null && user.authenticate(password)) {
	            System.out.println("Login successful!");
	        } else {
	            System.out.println("Invalid username or password. Please try again.");
	        }
	    }

	    public static User findUser(String username) {
	        for (User user : users) {
	            if (user.getUsername().equals(username)) {
	                return user;
	            }
	        }
	        return null;
	    }

	    public static void makeReservation() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your username: ");
	        String username = scanner.nextLine();

	        User user = findUser(username);

	        if (user == null) {
	            System.out.println("User not found. Please register or check your username.");
	            return;
	        }

	        System.out.print("Enter the flight number: ");
	        String flightNumber = scanner.nextLine();

	        Reservation reservation = new Reservation(reservationIdCounter++, username, flightNumber);
	        reservations.add(reservation);

	        System.out.println("Reservation successful! Your reservation ID is: " + reservation.getReservationId());
	    }

	    public static void cancelReservation() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your reservation ID: ");
	        int reservationId = scanner.nextInt();

	        Reservation reservation = findReservation(reservationId);

	        if (reservation == null) {
	            System.out.println("Reservation not found. Please check your reservation ID.");
	            return;
	        }

	        reservations.remove(reservation);
	        System.out.println("Reservation canceled successfully.");
	    }

	    public static Reservation findReservation(int reservationId) {
	        for (Reservation reservation : reservations) {
	            if (reservation.getReservationId() == reservationId) {
	                return reservation;
	            }
	        }
	        return null;
	    }
	    
}
