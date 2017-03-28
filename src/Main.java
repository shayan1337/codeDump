import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the customer service type: ");
        String customerServiceType = scan.nextLine().toUpperCase();
        System.out.println("Enter the number of weekdays and weekendDays: ");
        int weekdays = scan.nextInt();
        int weekendDays = scan.nextInt();

        Customer customer = new Customer(customerServiceType,weekdays,weekendDays);

        //Initialising all hotels with their rates for weekends and weekdays for regular and reward customers.
        //Star ratings also passed to the constructors
        Hotel Lakewood = new Hotel(110, 100, 100, 90, 3);
        Hotel Ridgewood = new Hotel(120, 110, 105, 95, 2);
        Hotel Bridgewood = new Hotel(130, 90, 90, 80, 4);

        //Creates a Decider object and then calls on the calculate method.
        Decider decider = new Decider();
        decider.calculate(customer, Lakewood, Ridgewood, Bridgewood);

    }
}


