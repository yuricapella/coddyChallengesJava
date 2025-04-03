package easy.coddy_02_01_2025.Mvc_Resolution.view;

public class SeatingView {
    public void displayResult(int[] result) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < result.length - 1) {
                sb.append(",");
            }
        }
        System.out.println("Resultado: " + sb.toString());
    }
}