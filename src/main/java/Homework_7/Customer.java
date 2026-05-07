package Homework_7;

public class Customer extends User{

    public Customer (String name, int age) {
        super(name, age);

    }

    @Override
    public String getRole(){

        return "клієнт";
    }

}
