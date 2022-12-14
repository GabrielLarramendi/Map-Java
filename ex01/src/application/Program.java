package application;

import model.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.00);
        Product p2 = new Product("Notebook", 1200.00);
        Product p3 = new Product("Tablet", 400.00);

        stock.put(p1, 10000.00);
        stock.put(p2, 20000.00);
        stock.put(p3, 15000.00);

        Product ps = new Product("TV", 900.00);

        System.out.println("Contains 'ps'  keys: " + stock.containsKey(ps));
    }
}
