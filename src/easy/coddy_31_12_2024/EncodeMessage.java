package easy.coddy_31_12_2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EncodeMessage {
    public static void main(String[] args) {
        List<String> testCases = Arrays.asList(
                "hello",
                "stay safe",
                "ym eman si nhoj",
                "ew era sreidlos gnithgif rof ruo yrtnuoc",
                "esaelp dnes erom seilppus sa noos sa elbissop",
                "ruo noitisop sah neeb desimorp ew era gnitaerter",
                "eht elttab saw ecreif tub ew degreme suoirotciv",
                "i epoh ot ees uoy lla niaga noos stay safe"
        );

        for (int i = 0; i < testCases.size(); i++) {
            String input = testCases.get(i);
            String output = encodeMessage(input);
            System.out.println("Case " + (i + 1) + ":");
            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
            System.out.println();
        }

    }
    public static String encodeMessage(String message) {
        return Arrays.stream(message.split(" "))
                .map(word -> word.contains("s")? word : new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
