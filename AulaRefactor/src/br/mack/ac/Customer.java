package br.mack.ac;

public class Customer {

    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;

    public Customer(String customerId, String name, String email, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void printCustomerDetails() {
        printCustomerID();
        printCustomerName();
        printCustomerEmail();
        printCustomerPhoneNumber();
    }

    public void printCustomerID() {
        System.out.println("Customer ID: " + customerId);
    }

    public void printCustomerName() {
        System.out.println("Name: " + name);
    }

    public void printCustomerEmail() {
        System.out.println("Email: " + email);
    }

    public void printCustomerPhoneNumber() {
        System.out.println("Phone Number: " + phoneNumber);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

