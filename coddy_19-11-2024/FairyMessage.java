class FairyMessage {
  public static String fairyMessage(int decimalNumber) {
    String binaryRepresentation = Integer.toBinaryString(decimalNumber);
    String binaryReverse = new StringBuilder(binaryRepresentation).reverse().toString();
    return binaryReverse;
  }
  public static void main(String[] args) {
    int decimalNumber = 10;
    System.out.println(fairyMessage(decimalNumber));
  }
}
