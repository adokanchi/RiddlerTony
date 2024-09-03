/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public String decryptOne(String encrypted) {
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char encryptChar = encrypted.charAt(i);
            if (encryptChar >= 'a' && encryptChar <= 'z') {
                decrypted += (char) ((encryptChar - 'a' + 9) % 26 + 'a');
            }
            else if (encryptChar >= 'A' && encryptChar <= 'Z') {
                decrypted += (char) ((encryptChar - 'A' + 9) % 26 + 'A');
            }
            else {
                decrypted += encryptChar;
            }
        }

        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String[] ASCII = encrypted.split(" ");
        for (String str : ASCII) {
            int result = 0;
            while (!str.isEmpty()) {
                result *= 10;
                result += str.charAt(0) - '0';
                str = str.substring(1);
            }
            decrypted += (char) result;
        }

        System.out.println(decrypted);
        return decrypted;
        // This is a comment
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        while (!encrypted.isEmpty()) {
            String encryptedBinary = encrypted.substring(0,8);

            // Convert encryptedBinary to a binary value
            int encryptedDecimal = 0;
            for (int i = 0; i < 8; i++) {
                encryptedDecimal = encryptedDecimal << 1;
                encryptedDecimal += encryptedBinary.charAt(i) - '0';
            }

            // Convert to text
            decrypted += (char) encryptedDecimal;

            encrypted = encrypted.substring(8);
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            decrypted += (char) (encrypted.charAt(i) - 9984 + 'A');
        }
        System.out.println(decrypted);
        return decrypted;
    }
}
