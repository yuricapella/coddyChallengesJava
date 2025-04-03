package easy.coddy_02_01_2025.Solid_Resolution;

public class Main {
    public static void main(String[] args) {
        SeatingArrangementService service = new SeatingArrangementServiceImpl();
        int[][][] testCases = SeatingDataProvider.getTestCases();

        for (int[][] testCase : testCases) {
            int[] seatingArrangement = testCase[0];
            int[] seatingChanges = testCase[1];
            int[] result = service.rearrangeSeating(seatingArrangement, seatingChanges);
            System.out.println(ArrayUtils.arrayToString(result));
        }
    }
}
