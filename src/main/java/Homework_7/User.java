package Homework_7;
//the roles will be created in daughter classes
//so we have to create a form for role,
//so that inheritance occurred, according to Liskov substitution principle (right?)
//and then we override this form in the daughter classes
public abstract class User  {

    private String name;
    private int age;

    public User (String name, int age){
        this.name =name;
        this.age=age;
    }

    public abstract String getRole();
}
