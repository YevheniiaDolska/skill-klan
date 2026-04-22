package Homework_3;

import java.util.Scanner;

public class DayCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Type a day:");
        String day = in.next();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
        }
    }
}

