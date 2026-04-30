import java.util.ArrayList;
import java.util.Arrays;

//I need to create an ArrayList fulfilled with the names of three cities and then to add one more
//I can't create the prefilled ArrayList
//However, I can create an Array and then turn it into an array list
//After that, I can add a name using a crutch
// Create a new ArrayList over the existing one and add a new city there
// I'll try that

class Cities {
    public static void main(String[] args) {
        String [] cities = {"Kyiv", "Lviv", "Odessa"};
        ArrayList<String> citylist = new ArrayList<>(Arrays.asList (cities));
        citylist.add("Dnipro");
        System.out.println(citylist);
    }
}