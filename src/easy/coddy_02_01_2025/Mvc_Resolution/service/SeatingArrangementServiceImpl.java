package easy.coddy_02_01_2025.Mvc_Resolution.service;

public class SeatingArrangementServiceImpl implements SeatingArrangementService {
    @Override
    public int[] rearrangeSeating(int[] seatingArrangement, int[] seatingChanges) {
        int[] result = new int[seatingArrangement.length];
        for (int i = 0; i < seatingArrangement.length; i++) {
            result[i] = seatingArrangement[i] + seatingChanges[i];
        }
        return result;
    }
}
