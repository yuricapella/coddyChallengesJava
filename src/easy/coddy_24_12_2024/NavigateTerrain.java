public class NavigateTerrain {
    public static void main(String[] args) {
        String[] fragments = {"start-forest-", "-mountain-v", "alley-end"};
        System.out.println(navigateTerrain(fragments));

        String[] fragments2 = {"fragment1-", "-fragment2-", "-fragment3-end"};
        System.out.println(navigateTerrain(fragments2));

        String[] fragments3 = {"nooverlap1", "nooverlap2"};
        System.out.println(navigateTerrain(fragments3));

        String[] fragments4 = {"single"};
        System.out.println(navigateTerrain(fragments4));

    }

    public static String navigateTerrain(String[] fragments) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < fragments.length; i++) {
            if(!result.toString().contains("-") && (i == fragments.length - 1)){
                result = new StringBuilder(fragments[i]);
                break;
            }
            result.append(fragments[i]);
        }
        if(result.toString().contains("--")){
            return "INVALID";
        }else{
            return result.toString();
        }
    }
}

