class DecodeMessage {
    public static String decodeMessage(String binaryMessage) {
        String[] binaryArray = binaryMessage.split(" ");
        StringBuilder asciiMessage = new StringBuilder();
        
        for (String binary : binaryArray) {
            int charCode = Integer.parseInt(binary,2);
            asciiMessage.append((char) charCode);
        }
        return asciiMessage.toString();
    }
    public static void main(String[] args) {
        String binaryMessage = "01010011 01100001 01101110 01100100 01110111 01101001 01100011 01101000";
        System.out.println(DecodeMessage.decodeMessage(binaryMessage));
    }
}



