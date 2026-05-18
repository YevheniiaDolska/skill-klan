package Homework_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть ціле число: ");
        int first_num = in.nextInt();
        System.out.println("Введіть ще одне ціле число: ");
        int second_num = in.nextInt();
        int result = Homework_4.Calculator.add(first_num, second_num);
        System.out.println(result);

    }
}
