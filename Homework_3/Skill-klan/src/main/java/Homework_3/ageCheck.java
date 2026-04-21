package Homework_3;

import java.util.Scanner;

public class ageCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть ваш вік:");
        int age = in.nextInt();
        if (age < 18) {
            System.out.println("Доступ заборонено");
        } else {
            System.out.println("Доступ дозволено");
        }
    }
}


