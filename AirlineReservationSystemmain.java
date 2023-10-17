package miniproject;

import java.util.Scanner;

public class AirlineReservationSystemmain {
	  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      AirlineReservationSystemApp obj=new AirlineReservationSystemApp();
        while(true) {
            System.out.println("Welcome to the Airline Reservation System");
            System.out.println("1. New Registration");
            System.out.println("2. Login");
            System.out.println("3. Reservation");
            System.out.println("4. Cancellation");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
		    obj.newUserRegistration();
                    break;
                case 2:
                    obj.login();
                    break;
                case 3:
                    obj.makeReservation();
                    break;
                case 4:
                    obj.cancelReservation();
                    break;
                case 5:
                    System.out.println("Thank you for using the Airline Reservation System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
	}

}
