public class crypthor {
    public static String crypt(String uncrypted) {

        String crypt = "";
        String[] letters = uncrypted.split("");
        int started = (int) (Math.floor(Math.random() * 8.0) + 1);
        crypt = "" + started;
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i].charAt(0);
            crypt = crypt + "." + ((int) letter + started);
        }
        return crypt;
    }

    public static String uncrypt(String crypted) {
        String[] Crypted = crypted.split("[.]");
        int started = Integer.parseInt(Crypted[0]);
        String phrase = "";
        for(int i = 1; i < Crypted.length; i++) {
            phrase = phrase + Character.toString((int) (Integer.parseInt(Crypted[i]) - started));
        }

        return phrase;

    }

}
