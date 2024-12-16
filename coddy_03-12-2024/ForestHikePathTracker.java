import java.util.Arrays;

class ForestHikePathTracker {
  public static int[] forestHikePathTracker(int[] elevations) {
      for (int i = 0; i < elevations.length; i++){
          if (elevations[i] < 5) {
              elevations[i] += 1;
          }
      }
      return elevations;
  }
  public static void main(String[] args) {
    int[] elevations = {1,2,3,4,5};
    //System.out.println(ForestHikePathTracker.forestHikePathTracker(elevations)); só assim mostrará um hashcode
    System.out.println(Arrays.toString(ForestHikePathTracker.forestHikePathTracker(elevations))); // assim converte a informação do array para string.
  }
}
