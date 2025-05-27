package easy.string_fibonacci_concat;

public class BotanicalMessage {

    public static void main(String[] args) {
        System.out.println(botanicalMessage("Rose", 8));
        System.out.println(botanicalMessage("Tulip", 6));
    }

    public static String botanicalMessage(String plantName, int index) {
        if (index == 0) return indexZeroMessage(plantName);
        if (index == 1) return indexOneMessage(plantName);

        int a = 0, b = 1;

        for (int i = 2; i <= index; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return plantName + b;
    }

    private static String indexZeroMessage(String plantName) {
        return plantName + "0";
    }

    private static String indexOneMessage(String plantName) {
        return plantName + "1";
    }
}
