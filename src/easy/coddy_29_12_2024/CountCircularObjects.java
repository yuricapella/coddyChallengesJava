package easy.coddy_29_12_2024;

import java.util.HashMap;

public class CountCircularObjects {
    public static void main(String[] args) {
        String remove = "remove";
        String add = "add";

        String ball = "ball";
        String coin = "coin";
        String lens = "lens";

        int count = 5;
        int count2= 1;
        int count3 = 0;

        System.out.println("BALL");
        System.out.println(countCircularObjects(add,ball,count));
        System.out.println(countCircularObjects(remove,ball,count));
        System.out.println("COIN");
        System.out.println(countCircularObjects(add,coin,count2));
        System.out.println(countCircularObjects(remove,coin,count2));
        System.out.println("LENS count <= 0");
        System.out.println(countCircularObjects(add,lens,count3));
        System.out.println(countCircularObjects(remove,lens,count3));
        System.out.println("LENS count > 0");
        System.out.println(countCircularObjects(add,lens,count));
        System.out.println(countCircularObjects(remove,lens,count));

    }
    public static String countCircularObjects(String action, String objectType, int count) {
        HashMap<String, Integer> objects = new HashMap<>();
        StringBuilder result;
        objects.put("ball", 0);
        objects.put("coin", 0);
        objects.put("lens", 0);

        if(action.equals("add")) {
            objects.put(objectType, objects.get(objectType) + count);
        } else if(action.equals("remove")) {
            objects.put(objectType, objects.get(objectType) - count);
        }
        if(count > 0 && action.equals("add")) {
            result = new StringBuilder("Current counts: ");
            result.append("balls = ").append(objects.get("ball")).append(", ");
            result.append("coins = ").append(objects.get("coin")).append(", ");
            result.append("lenses = ").append(objects.get("lens"));
        }else{
            result = new StringBuilder("Error: Not enough ");
            switch(objectType){
                case "ball"->result.append("balls ");
                case "coin"->result.append("coins ");
                case "lens"->result.append("lenses ");
            }
            switch(action){
                case "add"->result.append("to add.");
                case "remove"->result.append("to remove.");
            }
        }
        return result.toString();
    }
}
