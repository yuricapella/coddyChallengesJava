package medium.seed_sequence_ascii_base_conversion;

public class SeedSequencer {

    public static void main(String[] args) {
        String[] sementes = {"sunflower", "tomato"};
        int base = 10;

        String resultado = seedSequencer(sementes, base);
        System.out.println(resultado);

        String[] sementes2 = {"rose", "lily"};
        int base2 = 2;

        String resultado2 = seedSequencer(sementes2, base2);
        System.out.println(resultado2);
    }

    public static String seedSequencer(String[] seedList, int base) {
        StringBuilder seed = new StringBuilder();
        for (String word : seedList) {
            for (char character : word.toCharArray()) {
                int ascii = (int) character;
                String convertido = Integer.toString(ascii, base);
                seed.append(convertido);
            }
        }
        return seed.toString();
    }

}
