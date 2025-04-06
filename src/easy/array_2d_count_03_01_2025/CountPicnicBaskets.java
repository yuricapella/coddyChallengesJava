package easy.array_2d_count_03_01_2025;

public class CountPicnicBaskets {
    public static void main(String[] args) {
        int[][] picnicBlanket = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        int startRow = 0;
        int endRow = 2;
        int startCol = 0;
        int endCol = 2;

        int resultado = countPicnicBaskets(picnicBlanket, startRow, endRow, startCol, endCol);
        System.out.println("Cestas encontradas: " + resultado);
    }


    public static int countPicnicBaskets(int[][] picnicBlanket, int startRow, int endRow, int startCol, int endCol) {
        int contador = 0;
        for(int i = startRow;i<=endRow;i++){
            for(int j = startCol;j<=endCol;j++){
                if(picnicBlanket[i][j] == 1){
                    contador++;
                }
            }
        }
        return contador;
    }
}
