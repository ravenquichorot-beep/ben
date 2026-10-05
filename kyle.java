public class kyle {
    public static void main(String[] args) {
        String me = "I";
        String target = "you";
        boolean feelings = true;

        while (feelings) {
            System.out.println(me + " love " + target);
            // An infinite loop because the love never ends!
            break; // Remove this break if you want it to print forever
        }
    }
}