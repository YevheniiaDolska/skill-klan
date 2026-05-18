package Homework_8;

import java.util.ArrayList;
import java.util.Scanner;

import Homework_8.Product;

import static Homework_8.Product.validatePrice;

public class Main {
    public static void main(String[] args) {
        Product phone = new Product("iPhone", 3000, true);
        Product laptop = new Product("MacBook", 6000, true);
        Product tablet = new Product("iPad", 5000, false);

        ArrayList<Product> products = new ArrayList<>();
        products.add(phone);
        products.add(laptop);
        products.add(tablet);

        for (Homework_8.Product product : products) {
            product.printProductInfo();
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть ціну:");
        double price = in.nextDouble();
        try {
            validatePrice(price);
            System.out.println("Ціна:" + price);
        } catch (Homework_8.InvalidPriceException e) {
            System.out.println(e.getMessage());

        }
    }

}

