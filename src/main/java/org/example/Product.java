package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
    @Override
    public int compareTo(Product o) {
        return o.name.compareTo(this.name);
    }

    public String name;
    public  double price;
    public  LocalDate dateCreate;
    public  LocalDate dateEnd;

    public Product(String name, double price, LocalDate dateCreate, LocalDate dateEnd) {
        this.name = name;
        this.price = price;
        this.dateCreate = dateCreate;
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dateCreate=" + dateCreate +
                ", dateEnd=" + dateEnd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && Objects.equals(dateCreate, product.dateCreate) && Objects.equals(dateEnd, product.dateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, dateCreate, dateEnd);
    }
}
//class ProductComparator implements Comparator<Product> {
//    @Override
//    public int compare(Product p1) {
//        if(LocalDate.now().isAfter(p1.dateEnd)){
//            return 1;
//        }
//        else return -1;
//    }

