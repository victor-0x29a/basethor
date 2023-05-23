import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        String text = "Victao 2024";
        String crypted = crypthor.crypt(text);
        System.out.println("\n\nText: " + text);
        System.out.println("Crypted: " + crypted + "\n\n");
    }
}