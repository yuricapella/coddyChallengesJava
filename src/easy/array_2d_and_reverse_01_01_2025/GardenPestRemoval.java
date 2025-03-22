package easy.array_2d_and_reverse_01_01_2025;

public class GardenPestRemoval {
    public static void main(String[] args) {
        int[][][] gardens = {
                {{0, 0}, {0, 0}},
                {{1, 1}, {1, 1}},
                {{1, 2}, {3, 4}},
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}},
                {{1, 1, 1, 1, 1}, {1, 2, 2, 2, 1}, {1, 2, 3, 2, 1}, {1, 2, 2, 2, 1}, {1, 1, 1, 1, 1}},
                {{10, 20, 30, 40, 50}, {20, 30, 40, 50, 60}, {30, 40, 50, 60, 70}, {40, 50, 60, 70, 80}, {50, 60, 70, 80, 90}},
                {{100, 200, 300, 400, 500}, {200, 300, 400, 500, 600}, {300, 400, 500, 600, 700}, {400, 500, 600, 700, 800}, {500, 600, 700, 800, 900}}
        };

        int[] thresholds = {0, 4, 10, 15, 20, 6, 150, 1000};

        System.out.println(gardenPestRemoval(gardens[0], thresholds[0]));
        System.out.println(gardenPestRemoval(gardens[1], thresholds[1]));
        System.out.println(gardenPestRemoval(gardens[2], thresholds[2]));
        System.out.println(gardenPestRemoval(gardens[3], thresholds[3]));
        System.out.println(gardenPestRemoval(gardens[4], thresholds[4]));
        System.out.println(gardenPestRemoval(gardens[5], thresholds[5]));
        System.out.println(gardenPestRemoval(gardens[6], thresholds[6]));
        System.out.println(gardenPestRemoval(gardens[7], thresholds[7]));
    }
    public static int gardenPestRemoval(int[][] garden, int threshold) {
        int totalPestCount = 0;
        int linhas = garden.length;
        int colunas = garden[0].length;
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                int sum = 0;

                if (i > 0) sum += garden[i - 1][j];
                if (i < linhas - 1) sum += garden[i + 1][j];
                if (j > 0) sum += garden[i][j - 1];
                if (j < colunas - 1) sum += garden[i][j + 1];

                if (sum <= threshold) totalPestCount += garden[i][j];

            }
        }
        return Integer.parseInt(new StringBuilder(String.valueOf(totalPestCount)).reverse().toString());
    }
}
