package easy.coddy_02_01_2025.Solid_Resolution;

public class SeatingArrangementServiceImpl implements SeatingArrangementService {
    @Override
    public int[] rearrangeSeating(int[] seatingArrangement, int[] seatingChanges) {
        if (seatingArrangement == null || seatingChanges == null || seatingArrangement.length != seatingChanges.length) {
            throw new IllegalArgumentException("Arrays de entrada devem ser não nulos e ter o mesmo tamanho.");
        }
        int[] result = new int[seatingArrangement.length];
        for (int i = 0; i < seatingArrangement.length; i++) {
            result[i] = seatingArrangement[i] + seatingChanges[i];
        }
        return result;
    }
}
