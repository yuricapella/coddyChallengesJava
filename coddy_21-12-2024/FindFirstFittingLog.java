public class FindFirstFittingLog {
    public static void main(String[] args) {
        int fireplaceSize = 5;
        int[] logBasket = {3, 4, 5, 6, 7};
        System.out.println(findFirstFittingLog(fireplaceSize,logBasket));

        int fireplaceSize2 = 10;
        int[] logBasket2 = {12, 11, 10, 9, 8};
        System.out.println(findFirstFittingLog(fireplaceSize2,logBasket2));
    }

    public static int findFirstFittingLog(int fireplaceSize, int[] logBasket) {
        for(int i = 0; i < logBasket.length; i++){
            if (logBasket[i] <= fireplaceSize){
                return i;
            }
        }
        return -1;
    }
}
