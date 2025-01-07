public class SortPicnicItems {
    public static void main(String[] args) {
        String[] frutas = {"banana","abacaxi","uva","melancia","maçã"};
        String[] frutasOrdenadas = sortPicnicItems(frutas);
        for (int i = 0; i < frutasOrdenadas.length; i++){
            if (i == frutasOrdenadas.length - 1){
                System.out.print(frutasOrdenadas[i]);
            }else{
                System.out.print(frutasOrdenadas[i] + ",");
            }
        }

    }
    public static String[] sortPicnicItems(String[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i].compareTo(items[j]) > 0) {
                    String backup = items[i];
                    items[i] = items[j];
                    items[j] = backup;
                }
            }
        }
        return items;
    }
}
