package easy.coddy_02_01_2025.Mvc_Resolution.utils;

public class SeatingDataProvider {
    public static int[][][] getTestCases() {
        return new int[][][]{
                {{1, 2, 3}, {0, 0, 0}},
                {{10, 5, 8}, {2, -3, 1}},
                {{20, 15, 25}, {-5, -5, -5}},
                {{0, 0, 0}, {1, 1, 1}},
                {{100, 200, 300}, {50, -50, 100}},
                {{10, 20, 30, 40, 50}, {5, -10, 15, -20, 25}},
                {{1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000}, {-500, 1000, -1500, 2000, -2500, 3000, -3500, 4000}},
                {{5, 10, 15, 20, 25, 30, 35}, {2, -3, 4, -5, 6, -7, 8}}
        };
    }
}
