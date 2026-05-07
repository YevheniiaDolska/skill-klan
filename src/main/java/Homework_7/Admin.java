package Homework_7;

public class Admin extends User {

    public Admin(String name, int age){
        super(name, age);
    }

    @Override
    public String getRole(){
        return "адмін";
    }

}
