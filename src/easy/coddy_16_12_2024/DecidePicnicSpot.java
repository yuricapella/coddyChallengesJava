class DecidePicnicSpot {
    public static String decidePicnicSpot(boolean lovesShade, boolean lovesFlowers) {
        if(lovesShade == true && lovesFlowers == false){
            return "Oak tree";
        }else if(lovesShade == false && lovesFlowers == true){
            return "Flower bed";
        }else{
            return "Either spot is perfect!";
        }
    }
    public static void main(String[] args) {
    boolean lovesShade = false;
    boolean lovesFlowers = false;
    System.out.println(decidePicnicSpot(lovesShade, lovesFlowers));
  }
}
