import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть ціле число: ");
        int first_num = in.nextInt();
        System.out.println("Введіть ще одне ціле число: ");
        int second_num = in.nextInt();

        System.out.println(divide(first_num, second_num));
    }
    public static int divide (int a, int b) {
        try {
            int result = a / b;
            return result;
            }
        catch (ArithmeticException div_by_zero) {
            System.out.println("На нуль ділити не можна!");
            return 0;
            }
        }

    }
