public class DecipherAncientMessage {
    public static void main(String[] args) {
        String message = "Beware of the traps ahead!";
        String message2 = "Welcome, brave adventurer, to the lost city.";
        String message3 = "The path leads to the forgotten treasure.";

        System.out.println(decipherAncientMessage(message));
        System.out.println(decipherAncientMessage(message2));
        System.out.println(decipherAncientMessage(message3));
    }
    public static String decipherAncientMessage(String message) {
        message = message.toLowerCase();
        if(message.contains("danger") || message.contains("beware")){
            return "warning";
        } else if (message.contains("welcome") || message.contains("hello") || message.contains("greetings")) {
            return "welcome";
        }else{
            return "unknown";
        }
    }
}
