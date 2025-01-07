import java.util.Arrays;

public class SortPicnicItemsComArrays {
    public static void main(String[] args) {
        String[] frutas = {"banana","abacaxi","uva","melancia","maçã"};
        String[] frutasOrdenadas = sortPicnicItems(frutas);
        System.out.print(String.join(",", frutasOrdenadas));
    }
    public static String[] sortPicnicItems(String[] items) {
        Arrays.sort(items);
        return items;
    }
}
