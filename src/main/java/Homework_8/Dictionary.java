package Homework_8;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main (String[] args) {
        Map<String, Double> items = new HashMap <String, Double>();
        items.put("iPhone", 3000.0);
        items.put("MacBook", 6000.0);
        items.put("iPad", 4500.0);

        for (String key : items.keySet()) {
            Double price = items.get(key);
            System.out.println(key + ":" + price);

        }

    }
}
