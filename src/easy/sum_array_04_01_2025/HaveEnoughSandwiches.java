package easy.sum_array_04_01_2025;

import java.util.Arrays;

public class HaveEnoughSandwiches {

    public static void main(String[] args) {
        int[] sandwiches = {1, 2, 3};
        int availableSandwiches1 = 6;

        int[] sandwiches2 = {3, 3, 3, 3};
        int availableSandwiches2 = 11;

        System.out.println(haveEnoughSandwiches(sandwiches, availableSandwiches1));
        System.out.println(haveEnoughSandwiches(sandwiches2, availableSandwiches2));
    }

    public static boolean haveEnoughSandwiches(int[] sandwiches, int totalSandwiches) {
        return Arrays.stream(sandwiches).sum() == totalSandwiches;
    }

}
