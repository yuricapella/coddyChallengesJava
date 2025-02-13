package JavaEssentials.JavaFundamentalsChallenges;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Escolha um numero de 1 a 10");
        int theGuess = scanner.nextInt();
        scanner.close();

        if (theGuess > randomNumber){
            System.out.printf("Too high, random number is: %d\n",randomNumber);

        }else if(theGuess < randomNumber){
            System.out.printf("Too low, random number is: %d\n",randomNumber);
        }else{
            System.out.println("You are right!");
        }
    }
}
