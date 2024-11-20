class FairyMessage {
  public static String fairyMessage(int decimalNumber) {
    String binaryRepresentation = Integer.toBinaryString(decimalNumber);
    System.out.println(binaryRepresentation);
    String binaryReverse = new StringBuilder(binaryRepresentation).reverse().toString();
    System.out.println(binaryReverse);
    return binaryReverse;
  }
  public static void main(String[] args) {
    int decimalNumber = 10;
    System.out.println(decimalNumber);
    System.out.println(fairyMessage(decimalNumber));
}
}
