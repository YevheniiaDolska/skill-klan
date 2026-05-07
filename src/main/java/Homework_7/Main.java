package Homework_7;

public class Main {
    public static void main(String[] args) {
        Product phone = new Product("iPhone", 3000, true);
        Product laptop = new Product("MacBook", 6000, true);

        phone.printProductInfo();
        laptop.printProductInfo();

        DiscountedProduct discountedPhone = new DiscountedProduct("iPhone", 3000, true, 30);
        phone.printProductInfo();
        System.out.println("Ціна зі знижкою:" +" " + discountedPhone.getDiscountedPrice());


    }
}