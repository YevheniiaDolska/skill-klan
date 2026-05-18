package Homework_7;

import java.util.Scanner;

public class ZeroDivision {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть ціле число: ");
        int a = in.nextInt();
        System.out.println("Введіть ціле число: ");
        int b = in.nextInt();

        System.out.println(a + "/" + b );
        divide(a, b);
    }

    public static int divide (int a, int b){
                try {
                    int result = a / b;
                    System.out.println("Результат: " + result);
                    return result;
                } catch (ArithmeticException div_by_zero) {
                    System.out.println("На нуль ділити не можна!");
                    return 0;
                }

                finally {
                    System.out.println("Операція завершена");
                }
        }
    }

