package medium.yearbook_id_substring_binary_concat;

public class GenerateYearbookIdSimple {
    public static void main(String[] args) {
        String name = "Yuri Capella";
        int graduationYear = 2020;

        System.out.println(generateYearbookIdSimple(name, graduationYear));
    }

    public static String generateYearbookIdSimple(String name, int graduationYear) {
        final int NAME_CHAR_LIMIT = 3;
        int nameLength = name.length();
        StringBuilder result = new StringBuilder();
        if(name.length() > NAME_CHAR_LIMIT){
            name = getFirstNameCharsSimple(name, NAME_CHAR_LIMIT);
        }
        result.append(name);
        result.append("20");
        result.append(getLastYearCharsBinarySimple(graduationYear));
        result.append(nameLength);
        return result.toString();
    }

    public static String getFirstNameCharsSimple(String name, int limit) {
        return name.substring(0, limit);
    }

    public static String getLastYearCharsBinarySimple(int graduationYear) {
        return Integer.toBinaryString(graduationYear % 100);
    }
}
