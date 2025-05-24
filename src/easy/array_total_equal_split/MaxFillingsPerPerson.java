package easy.array_total_equal_split;

import java.util.Arrays;

public class MaxFillingsPerPerson {

    public static void main(String[] args) {
        int[] sandwiches = {1, 2, 3, 4, 5};
        int result = maxFillingsPerPerson(sandwiches);
        System.out.println("Maximum fillings per person: " + result);
    }

    public static int maxFillingsPerPerson(int[] sandwiches) {
        int persons = sandwiches.length;
        int total = Arrays.stream(sandwiches).sum();
        return total / persons;
    }
}
