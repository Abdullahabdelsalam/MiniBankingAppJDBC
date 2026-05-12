package model;

public class Customer {
    private int id;
    private String firstName;
    private String email;
    private double balance;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Customer(int id, String firstName, double balance, String email) {
        this.id = id;
        this.firstName = firstName;
        this.balance = balance;
        this.email = email;
    }

    public Customer() {};

    public Customer(String firstName, String email, double balance) {
        this.firstName = firstName;
        this.email = email;
        this.balance = balance;
    }
}
