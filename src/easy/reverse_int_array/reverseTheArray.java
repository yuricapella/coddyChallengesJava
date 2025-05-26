package easy.reverse_int_array;

public class reverseTheArray {

    public static void main(String[] args) {
        int[] seatNumbers = {1, 2, 3, 4, 5};
        int[] reversedSeatNumbers = reverseTeaArray(seatNumbers);
        for (int seatNumber : reversedSeatNumbers) {
            System.out.print(seatNumber + " ");
        }
    }

    public static int[] reverseTeaArray(int[] seatNumbers) {
        int[] reversedSeatNumbers = new int[seatNumbers.length];
        int index = 0;
        for(int i = seatNumbers.length - 1; i >= 0;i--){
            reversedSeatNumbers[index] = seatNumbers[i];
            index++;
        }
        return reversedSeatNumbers;
    }
}
