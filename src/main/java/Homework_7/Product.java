package Homework_7;


//as incapsulation mechanism is useless without checks,
// I will add some checks to setters

public class Product {
    private String name;
    private double price;
    private boolean available;

    public Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public boolean isAvailable() {
        return available;

    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void printProductInfo() {
        System.out.println("Назва:" + " " + name);
        System.out.println("Ціна:" + " " + price);
        System.out.println("Наявність:" + " " + available);
    }
}