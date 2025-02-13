package JavaEssentials.JavaFundamentalsChallenges;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        boolean calculate = true;
        Scanner input = new Scanner(System.in);
        while(calculate){
            char symbol = input.nextLine().charAt(0);
            if (symbol == 'e'){
                break;
            }
            float a = input.nextFloat();
            float b = input.nextFloat();
            input.nextLine();
            switch(symbol){
                case '+': System.out.println(a+b); break;
                case '-': System.out.println(a-b); break;
                case '*': System.out.println(a*b); break;
                case '/': System.out.println(a/b); break;
            }
        }
        input.close();
    }

}
