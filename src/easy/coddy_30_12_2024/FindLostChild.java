package easy.coddy_30_12_2024;

public class FindLostChild {
    public static void main(String[] args) {
        int[] familyLocations = {1,2,3,4,5};
        int timmyLocation = 3;
        System.out.println(findLostChild(familyLocations, timmyLocation));

        int[] familyLocations2 = {10, 20, 30, 40, 50};
        int timmyLocation2 = 25;
        System.out.println(findLostChild(familyLocations2, timmyLocation2));

        int[] familyLocations3 = {100, 200, 300, 400, 500};
        int timmyLocation3 = 350;
        System.out.println(findLostChild(familyLocations3, timmyLocation3));

        int[] familyLocations4 = {-10, -20, -30, -40, -50};
        int timmyLocation4 = -25;
        System.out.println(findLostChild(familyLocations4, timmyLocation4));

        int[] familyLocations5 = {1, 3, 5, 7, 9};
        int timmyLocation5 = 0;
        System.out.println(findLostChild(familyLocations5, timmyLocation5));
    }

    public static int findLostChild(int[] familyLocations, int timmyLocation) {
        int closestIndex = 0;
        int minDifference = Math.abs(familyLocations[0] - timmyLocation);

        for (int i = 1; i < familyLocations.length; i++) {
            int difference = Math.abs(familyLocations[i] - timmyLocation);

            if (difference < minDifference) {
                minDifference = difference;
                closestIndex = i;
            }
        }
        return closestIndex;
    }
}
