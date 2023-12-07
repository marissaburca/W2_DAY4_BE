package org.example;

import org.example.entities.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Product[] products ={
                new Product("peluche1", Category.Baby,50.5),
                new Product("peluche2", Category.Baby,70.5),
                new Product("peluche3", Category.Baby,20.5),
                new Product("peluche4", Category.Baby,100.5),
                new Product("book1", Category.Books,80.8),
                new Product("book2", Category.Books,101.5),
                new Product("book3", Category.Books,115.9),
                new Product("book4", Category.Books,99.99),
                new Product("jacket", Category.Boys,60.6),
                new Product("Hoodie", Category.Boys,80.1),
                new Product("Jeans", Category.Boys,35.5),
                new Product("T-shirt", Category.Boys,20.9),
        };
        List<Product> list1 = new ArrayList<>();
        list1.add(products[1]);
        list1.add(products[2]);
        list1.add(products[6]);

        List<Product> list2 = new ArrayList<>();
        list1.add(products[6]);
        list1.add(products[3]);
        list1.add(products[9]);

        List<Product> list3 = new ArrayList<>();
        list1.add(products[5]);
        list1.add(products[7]);
        list1.add(products[0]);

        Customer[] customers ={
                new Customer("Ilaria", 3),
                new Customer("Luca", 2),
                new Customer("Lucia", 2),
                new Customer("Marco", 1),
                new Customer("Diana", 2),
        };

        Order[] orders={
                new Order(Status.Preparatin, LocalDate.of(2021,1,10),LocalDate.of(2021,1,25),list1,customers[2]),
                new Order(Status.Delivered, LocalDate.of(2021,3,30),LocalDate.of(2021,5,10),list2,customers[1]),
                new Order(Status.Delivered, LocalDate.of(2021,3,25),LocalDate.of(2021,4,1),list2,customers[4]),
                new Order(Status.OnTheWay, LocalDate.of(2021,5,15),LocalDate.of(2021,5,22),list3,customers[3]),
                new Order(Status.Delivered, LocalDate.of(2021,3,25),LocalDate.of(2021,4,1),list1,customers[0]),
                new Order(Status.Delivered, LocalDate.of(2021,3,25),LocalDate.of(2021,4,1),list2,customers[4]),
                new Order(Status.OnTheWay, LocalDate.of(2021,5,15),LocalDate.of(2021,5,22),list3,customers[3]),
                new Order(Status.Delivered, LocalDate.of(2021,3,25),LocalDate.of(2021,4,1),list3,customers[3]),

        };
        //Esercizio1

    }
}
