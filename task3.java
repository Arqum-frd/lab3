package lab3;

import java.util.Date;
import java.util.List;

// Interface for common functions related to ticket booking
interface CommonFunctions {
    void searchTicket();
    void bookTicket();
    void cancelTicket();
    void makePayment();
    void fillDetails();
}

// Class representing a Customer
class Customer {
    private String customerId;
    private String name;
    private String address;
    private int phoneNo;
    private int age;
    private List<Ticket> tickets;

    public Customer(String customerId, String name, String address, int phoneNo, int age) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    public void addDetails() {
        // Implementation for adding customer details
    }

    public void modifyDetails() {
        // Implementation for modifying customer details
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}

// Class representing an Agent that implements common functions
class Agent implements CommonFunctions {
    private int id;
    private String name;

    public Agent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void searchTicket() {
        // Implementation for searching tickets
    }

    @Override
    public void bookTicket() {
        // Implementation for booking a ticket
    }

    @Override
    public void cancelTicket() {
        // Implementation for cancelling a ticket
    }

    @Override
    public void makePayment() {
        // Implementation for making payment
    }

    @Override
    public void fillDetails() {
        // Implementation for filling details
    }
}

// Class representing a Ticket
class Ticket {
    private String source;
    private String destination;
    private Date dateOfJourney;
    private String time;
    private String busNo;
    private String seatNo;

    public Ticket(String source, String destination, Date dateOfJourney, String time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }
}

// Class for managing bookings at the counter
class BookingCounter {
    private List<Ticket> bookedTickets;

    public List<Ticket> getBookedTickets() {
        return bookedTickets;
    }

    public void setBookedTickets(List<Ticket> bookedTickets) {
        this.bookedTickets = bookedTickets;
    }
}

// Class for handling refunds
class Refund {
    private float amount;
    private String customerId;

    public Refund(float amount, String customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }

    public void refundAmount() {
        // Implementation for refunding amount
    }
}

// Main class to test the functionality (optional)
public class task3 {
    public static void main(String[] args) {
        // Example usage
        Customer customer = new Customer("C001", "John Doe", "123 Main St", 1234567890, 30);
        Agent agent = new Agent(1, "Agent Smith");

        // Further code to test functionalities
    }
}
