package easy.coddy_27_12_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetItemsToPack {
    public static void main(String[] args) {
        String[] packingList = {"Toothbrush", "Shampoo", "Towel", "Socks"};
        String[] itemsPacked = {"Shampoo", "Socks"};

        String[] missingItems = getItemsToPack(packingList, itemsPacked);
        System.out.println(Arrays.toString(missingItems));
    }

    public static String[] getItemsToPack(String[] packingList, String[] itemsPacked) {
        List<String> missingItemsList = new ArrayList<>();

        for(String item : packingList){
            boolean isPacked = false;

            for(String packedItem: itemsPacked){
                if (item.equalsIgnoreCase(packedItem)){
                    isPacked = true;
                }
            }

            if(!isPacked){
                missingItemsList.add(item);
            }
        }
        return missingItemsList.toArray(new String[0]);
    }
}
