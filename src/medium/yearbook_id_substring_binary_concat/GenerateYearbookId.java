package medium.yearbook_id_substring_binary_concat;

public class GenerateYearbookId {
    public static void main(String[] args) {
        String name = "Yuri Capella";
        int graduationYear = 2020;
        System.out.println(generateYearbookId(name, graduationYear));
    }

    public static String generateYearbookId(String name, int graduationYear) {
        final int NAME_CHAR_LIMIT = 3;
        int nameLength = name.length();

        StringBuilder result = new StringBuilder();

        if(name.length() > NAME_CHAR_LIMIT){
            name = getFirstNameChars(name, NAME_CHAR_LIMIT);
        }

        result.append(name);
        result.append("20");
        result.append(getLastYearCharsBinary(graduationYear));
        result.append(nameLength);
        return result.toString();
    }

    public static String getFirstNameChars(String name, int NAME_CHAR_LIMIT){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < NAME_CHAR_LIMIT;i++){
            result.append(name.charAt(i));
        }
        return result.toString();
    }

    public static String getLastYearCharsBinary(int graduationYear){
        int lastTwoDigitYear = graduationYear % 100;
        String binary = Integer.toBinaryString(lastTwoDigitYear);
        return binary;
    }
}
