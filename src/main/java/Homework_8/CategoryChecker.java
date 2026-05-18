package Homework_8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


    public class CategoryChecker {
        public static void main(String[] args) {
            Set<String> items = new HashSet<>();


            items.add("Електроніка");
            items.add("Одяг");
            items.add("Побутова техніка");
            items.add("Побутова техніка");

            Scanner in = new Scanner(System.in);
            System.out.println("Введіть категорію товару: ");
            String itemCategory = in.nextLine();


            if (items.contains(itemCategory)) {
                System.out.println("Є така категорія!");
            } else {
                System.out.println("Категорії немає.");
            }

        }
    }

