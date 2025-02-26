package br.mack.ac;

public class Order {
    private String orderId;
    private Customer customer;
    private double amount;

    public Order(String orderId, Customer customer, double amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
    }

    public void printOrder() {
        System.out.println("Order ID: " + orderId);
        //separamos aqui os prints por atributo
    }

    public void printCustomerId() {
        System.out.println("Customer ID: " + customer.getCustomerId());
    }

    public void printCustomerData() {
        System.out.println("Customer Data: " + customer.toString());
    }

    public void printAmount() {
        System.out.println("Amount: $" + amount);
    }


    public void applyDiscount(double discountPercentage) {
        if (isValidDiscount(discountPercentage)) {
            amount = calculateDiscount(discountPercentage);
        }
    }

    private boolean isValidDiscount(double discountPercentage) {
        return  discountPercentage > 0 && discountPercentage <= 100;
    }

    private double calculateDiscount(double discountPercentage) {
        return amount - (amount * discountPercentage / 100);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomerId() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", amount=" + amount +
                '}';
    }
}
