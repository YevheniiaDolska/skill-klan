package Homework_3;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int index = -1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть число:");
        int goal = in.nextInt();

        //boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == goal) {
                index = i;
                //System.out.println(i);
                //found = true;
                break;
            }
        }
        System.out.println(index);
    }
}


