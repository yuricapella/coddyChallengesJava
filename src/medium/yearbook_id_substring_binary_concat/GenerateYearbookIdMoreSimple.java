package medium.yearbook_id_substring_binary_concat;

public class GenerateYearbookIdMoreSimple {
    public static void main(String[] args) {
        System.out.println(generateYearbookIdMoreSimple("Yuri Capella", 2020));
    }

    public static String generateYearbookIdMoreSimple(String name, int graduationYear) {
        String prefix = name.length() <= 3 ? name : name.substring(0, 3);
        return prefix +
                "20" +
                Integer.toBinaryString(graduationYear % 100) +
                name.length();
    }
}
