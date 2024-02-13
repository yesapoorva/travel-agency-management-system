public class App {
    public static void main(String[] args) {
        // Creating activities
        Destination destination1 = new Destination("Mountain Resort");
        Destination destination2 = new Destination("Beach Resort");

        Activity activity1 = new Activity("Hiking", "Enjoy a scenic hike", 50.0, 20, destination1);
        Activity activity2 = new Activity("Snorkeling", "Explore underwater life", 80.0, 15, destination2);
        Activity activity3 = new Activity("City Tour", "Guided tour of the city", 30.0, 25, destination2);

        // Adding activities to destinations
        destination1.addActivity(activity1);
        destination2.addActivity(activity2);
        destination2.addActivity(activity3);

        // Creating passengers
        Passenger passenger1 = new Passenger("John", 101);
        Passenger passenger2 = new Passenger("Alice", 102);
        Passenger passenger3 = new Passenger("Bob", 103);

        // Creating travel package
        TravelPackage travelPackage = new TravelPackage("Adventure Package", 30);
        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Print itinerary
        travelPackage.printItinerary();

        // Print passenger list
        travelPackage.printPassengerList();

        // Print details of an individual passenger
        travelPackage.printPassengerDetails(passenger1);

        // Print details of available activities
        travelPackage.printAvailableActivities();

        // Simulate activity sign-up
        // Implement your testing scenarios here
    }
}
