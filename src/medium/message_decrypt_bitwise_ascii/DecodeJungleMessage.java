package medium.message_decrypt_bitwise_ascii;

public class DecodeJungleMessage {
    public static void main(String[] args) {
        int[] message = {65, 66, 67, 68, 69, 70};
        int key = 1;
        System.out.println(decodeJungleMessage(message, key));

        int[] message2 = {100, 101, 102, 103, 104, 105};
        int key2 = 2;
        System.out.println(decodeJungleMessage(message2, key2));

    }

    public static String decodeJungleMessage(int[] message, int key) {
        StringBuilder mensagem = new StringBuilder();
        for (int i = 0; i < message.length; i++) {
            if (i % key != 0) continue;

            int valor = message[i];

            if (valor % 2 == 0) {
                valor = valor & key;
            } else {
                valor = valor | key;
            }

            if (valor % 3 == 0) {
                valor -= 1;
            }

            if (valor % 5 == 0) {
                valor += 1;
            }

            char letra = (char) valor;
            mensagem.append(letra);
        }
        return mensagem.toString();
    }
}
