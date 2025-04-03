package easy.coddy_02_01_2025.Simple_Resolution;

public class RearrangeSeating {
    public static void main(String[] args) {
        int[] seatingArrangement = {};
        int[] seatingChanges = {};
        int[] result = rearrangeSeating(seatingArrangement, seatingChanges);
    }


    public static int[] rearrangeSeating(int[] seatingArrangement, int[] seatingChanges) {
        int[] result = new int [seatingArrangement.length];
        for (int i = 0; i < seatingArrangement.length; i++) {
            result[i] += (seatingArrangement[i] + seatingChanges[i]);
        }
        return result;
    }
}

