package org.example;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        Product product = new Product(
                "Pomidor",
                222.2,
                LocalDate.of(2024,9,21),
                LocalDate.of(2024,10,21)
                );
        Product product1 = new Product(
                "Apple",
                120.5,
                LocalDate.of(2024, 10, 15),
                LocalDate.of(2024, 11, 15)
        );

        Product product2 = new Product(
                "Orange",
                80.0,
                LocalDate.of(2024, 9, 10),
                LocalDate.of(2024, 10, 24)
        );

        Product product3 = new Product(
                "Banana",
                65.3,
                LocalDate.of(2024, 10, 20),
                LocalDate.of(2024, 11, 20)
        );

        Product product4 = new Product(
                "Grapes",
                200.0,
                LocalDate.of(2024, 10, 18),
                LocalDate.of(2024, 11, 18)
        );

        Product product5 = new Product(
                "Strawberry",
                350.7,
                LocalDate.of(2024, 10, 25),
                LocalDate.of(2024, 11, 25)
        );

        Product product6 = new Product(
                "Strawberry",
                350.7,
                LocalDate.of(2024, 10, 25),
                LocalDate.of(2024, 11, 25)
        );

        Set<Product> products = new TreeSet<>();

        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);


//        Set<Product> products2 = new TreeSet<>();
//        products2.add(product6);
//        products2.add(product6);
//        products2.addAll(products);




        printDeadProducts(products);
        printDeadProductsThree(products);
        sumProducts(products);
        setGoodProducts(products);
    }
//    public static void printSet(Set<Product> set) {
//        for(Product p: set){
//            System.out.println(p.toString());
//        }
//    }


    //метод который выводит только те продукты которые уже просроченные
    public static void printDeadProducts(Set<Product> set) {
        for(Product p: set){
            if (p.dateEnd.isBefore(LocalDate.now())) {
                System.out.println(p.toString());
            }
        }
    }
    //метод который выводит только те продукты которые будут просроченны в течении 3 дней
    public static void printDeadProductsThree(Set<Product> set) {
        for(Product p: set){
            if (p.dateEnd.getDayOfMonth() - LocalDate.now().getDayOfMonth() >= 3) {
                System.out.println(p.toString());
            }
            }
        }

    //метод который выводить сумму всех продуктов
    public static void sumProducts(Set<Product> set) {
        double allPrice = 0;
        for(Product p: set){
            allPrice += p.price;
        }
        System.out.println(allPrice);
    }
    //метод который вернет обратно новый сет из продуктов которые не просроченые
    public static void setGoodProducts(Set<Product> set){
        Set<Product> goodProducts = new HashSet<>();
        for(Product p: set){
            if (p.dateEnd.isAfter(LocalDate.now())) {
                goodProducts.add(p);
            }
            System.out.println(goodProducts);
        }
    }
}



