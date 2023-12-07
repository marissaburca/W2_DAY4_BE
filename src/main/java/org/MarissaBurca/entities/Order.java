package org.MarissaBurca.entities;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Order {
    Long id;
    Status status;
    LocalDate orderDate;
    LocalDate deliveryDate;
    List<Product> products;
    Customer customer;

    public LocalDate getOrderDate () {
        return orderDate;
    }
    public Customer getCustomer () {
        return customer;
    }


    @Override
    public String toString () {
        return "Order " + "id=" + id + ", status=" + status + ", orderDate=" + orderDate  + ", customer=" + customer ;
    }

    public List<Product> getProducts () {
        return products;
    }

    public Order ( Status status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer ) {
        this.id = generateRandomId();
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    private Long generateRandomId() {
        Random random = new Random();
        return (long) (random.nextInt(2001 - 1000) + 1000);
    }
}
