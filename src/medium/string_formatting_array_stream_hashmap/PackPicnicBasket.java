package medium.string_formatting_array_stream_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PackPicnicBasket {
    public static void main(String[] args) {
        String[] items = {"sandwich", "chips", "soda", "fruit"};
        int[] quantities = {2, 3, 1, 5};
        int maxWeight = 10;
        System.out.println(packPicnicBasket(items, quantities, maxWeight));
    }

    public static String packPicnicBasket(String[] items, int[] quantities, int maxWeight) {
        HashMap<String, Integer> basket = new HashMap<>();
        int currentWeight = 0;

        for (int i = 0; i < items.length; i++) {
            int itemWeight = quantities[i];
            if (currentWeight + itemWeight > maxWeight) break;
            basket.put(items[i], itemWeight);
            currentWeight += itemWeight;
        }
        return formatBasket(basket);
    }

    public static String formatBasket(Map<String, Integer> basket) {
        return basket.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining("\n"));
    }
}
