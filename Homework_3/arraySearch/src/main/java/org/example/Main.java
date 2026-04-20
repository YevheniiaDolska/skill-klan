package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int[] nums = {1, 2, 3, 4, 5};

        int goal = 4;

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == goal) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found) {
        System.out.println("-1");
        }
    }
}



