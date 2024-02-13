public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;

    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        balance = 0; 
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to update balance
    public void updateBalance(double amount) {
        balance += amount;
    }
}