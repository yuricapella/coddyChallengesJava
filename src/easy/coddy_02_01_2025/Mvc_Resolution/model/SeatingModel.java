package easy.coddy_02_01_2025.Mvc_Resolution.model;

public class SeatingModel {
    private int[] seatingArrangement;
    private int[] seatingChanges;
    private int[] result;

    public SeatingModel(int[] seatingArrangement, int[] seatingChanges) {
        if (seatingArrangement == null || seatingChanges == null || seatingArrangement.length != seatingChanges.length) {
            throw new IllegalArgumentException("Arrays de entrada devem ser não nulos e ter o mesmo tamanho.");
        }
        this.seatingArrangement = seatingArrangement;
        this.seatingChanges = seatingChanges;
    }

    public int[] getSeatingArrangement() {
        return seatingArrangement;
    }

    public int[] getSeatingChanges() {
        return seatingChanges;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }
}