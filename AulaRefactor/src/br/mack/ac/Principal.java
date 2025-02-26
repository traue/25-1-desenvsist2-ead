package br.mack.ac;

public class Principal {
    public static void main(String[] args) {

        Customer c1 = new Customer(
                "Y1", "Yasmin", "yasmin@mack.br", "12341234"
        );

        Order order1 = new Order("#101", c1,10000);

        System.out.println("Order 1: " + order1.toString());

        order1.applyDiscount(50);

        System.out.println("Pedido após aplicação do desconto:");

        System.out.println("Order 1: " + order1.toString());
    }
}
