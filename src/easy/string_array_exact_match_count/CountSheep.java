package easy.string_array_exact_match_count;

import java.util.Arrays;

public class CountSheep {

    public static void main(String[] args) {
        String[] sheepNames = {"Dolly", "Baa the sheep", "Lamb"};
        String[] fullNames = {"Dolly the Sheep", "Baa the sheep", "Lamb the Sheep"};

        int count = countSheep(sheepNames, fullNames);
        int countWithStreams = countSheepWithStreams(sheepNames, fullNames);
        System.out.println("Count of sheep: " + count);
        System.out.println("Count of sheep with streams: " + countWithStreams);
    }

    public static int countSheep(String[] sheepNames, String[] fullNames) {
        int count = 0;
        for (String sheepName : sheepNames) {
            for (String fullName : fullNames) {
                if (sheepName.equalsIgnoreCase(fullName)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int countSheepWithStreams(String[] sheepNames, String[] fullNames) {
        return (int) Arrays.stream(sheepNames)
                .filter(name -> Arrays.stream(fullNames)
                .anyMatch(fullName -> fullName.equals(name)))
                .count();
    }
}
