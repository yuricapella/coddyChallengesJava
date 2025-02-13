import java.util.Scanner;

class DetermineWaterBottleType {
    public static String determineWaterBottleType(int temperature, boolean prefersColdWater) {
        if (temperature >= 30){
            return "cold water bottle";
        }else if(temperature < 30 && prefersColdWater){
            return "cold water bottle";
        }else{
            return "room temperature water bottle";
        }
    }
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a temperatura: ");
    int temperature = entrada.nextInt();
    System.out.println("Digite o prefers cold water bottle: ");
    boolean prefersColdWater = entrada.nextBoolean();
    entrada.close();

    System.out.println(determineWaterBottleType(temperature, prefersColdWater));
  }
}
