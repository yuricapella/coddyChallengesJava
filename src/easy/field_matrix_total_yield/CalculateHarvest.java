package easy.field_matrix_total_yield;

public class CalculateHarvest {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        float yieldPerPlant = 2.5f;
        System.out.println("Total yield: " + calculateHarvest(rows,columns,yieldPerPlant));
        System.out.println("Total yield: " + calculateHarvest2(rows,columns,yieldPerPlant));
    }

    public static float calculateHarvest(int rows, int columns, float yieldPerPlant) {
        float total = 0;
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                total+=yieldPerPlant;
            }
        }
        return total;
    }

    public static float calculateHarvest2(int rows, int columns, float yieldPerPlant) {
        return yieldPerPlant * (rows * columns);
    }
}
