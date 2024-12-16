class DecodeMessageReverse {
  public static String decodeMessage(String message) {
      String reversed = new StringBuilder(message).reverse().toString();
      String replaced = reversed.replace("a","*").replace("m","#");
      return replaced.toLowerCase();
  }
  public static void main(String[] args) {
    String message = "god yz*l eht revo sp#uj xof nworb kciuq eht";
    System.out.println(decodeMessage(message));
  }
}
