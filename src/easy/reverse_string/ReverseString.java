package easy.reverse_string;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, world!";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String inputString) {
        StringBuilder novaString = new StringBuilder();
        for(int i = inputString.length()-1; i >= 0;i--){
            novaString.append(inputString.charAt(i));
        }
        return novaString.toString();
    }
}
