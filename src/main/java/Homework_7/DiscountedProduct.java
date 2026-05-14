package Homework_7;

public class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, boolean available, double discount) {
        super(name, price, available);
        this.discount = discount;
    }

    public void setDiscount(double discount){
        if (discount>0 && discount<100) {
            this.discount = discount;
        }
    }

    public double getDiscountedPrice() {
        return getPrice() - (getPrice() * discount/100);
    }




}


