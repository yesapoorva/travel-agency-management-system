import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        itinerary = new ArrayList<>();
        passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    // Method to add passenger to the travel package
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    // Method to print itinerary of the travel package
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            List<Activity> activities = destination.getActivities();
            for (Activity activity : activities) {
                System.out.println("Activity: " + activity.getName() + ", Cost: $" + activity.getCost() +
                        ", Capacity: " + activity.getCapacity() + ", Description: " + activity.getDescription());
            }
        }
    }

    // Method to print passenger list of the travel package
    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Passenger Name: " + passenger.getName() + ", Passenger Number: " + passenger.getPassengerNumber());
        }
    }

    // Method to print details of an individual passenger
    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Details:");
        System.out.println("Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerNumber());
        System.out.println("Balance: $" + passenger.getBalance()); // Assuming balance for standard and gold passengers
        // Print list of activities signed up by the passenger
        // Implement your logic here
    }

    // Method to print details of activities that still have spaces available
    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : itinerary) {
            List<Activity> activities = destination.getActivities();
            for (Activity activity : activities) {
                int availableSpaces = activity.getCapacity(); // Assuming all spaces are available initially
                // Implement logic to calculate available spaces based on passengers signed up
                System.out.println("Activity: " + activity.getName() + ", Available Spaces: " + availableSpaces);
            }
        }
    }
}