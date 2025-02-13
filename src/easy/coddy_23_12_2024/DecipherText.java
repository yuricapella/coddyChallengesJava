public class DecipherText {
    public static void main(String[] args) {
        String text = "dog lazy the over fox brown quick the";
        System.out.println(decipherText(text));

        String text2 = "JAVA rocks PYTHON fun is CODE";
        System.out.println(decipherText(text2));
    }

    public static String decipherText(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals(words[i].toUpperCase())) {
                if (!result.isEmpty()) {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }
        return result.toString();
    }
}
