package easy.coddy_04_12_2024;

class FindTreasure {
  public static int findTreasure(int[] map, int start) {
      int[] visited = new int[map.length];

      while(true){
          if (start < 0 || start >= map.length){
              return -1;

          }
          if(visited[start] == 1){
              return start;
          }
          visited[start] = 1;
          start = map[start];
      } 
  }
  public static void main(String[] args) {
    int[] map = {1, 2, 3, 4, 5, 0};
    int start = 0;
    System.out.println(findTreasure(map,start));

    int[] mapTwo = {1, 2, 3, 4, 5, -1};
    start = 0;
    System.out.println(findTreasure(mapTwo,start));
  }
}
