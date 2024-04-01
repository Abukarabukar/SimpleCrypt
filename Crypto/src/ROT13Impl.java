import static org.testng.internal.Utils.writeFile;
import static org.testng.reporters.Files.readFile;

public class ROT13Impl extends ROT13 {
    ROT13Impl(Character cs, Character cf) {
        super(cs, cf);
    }

    ROT13Impl() {
    }

    public ROT13Impl(char start, char mid) {
        super(start, mid);
    }


    public void readEncryptAndDecrypt(){

    }

        public static void main(String[] args) {
            String inputFile = "sonnet18.txt"; // Path to the input text file
            ROT13 cipherUtil = new ROT13(); // Create an instance of CipherUtil
            String encryptedText = cipherUtil.encrypt(inputFile); // Call the encrypt method
            System.out.println("Encrypted text:\n" + encryptedText); // Print the encrypted text

    }


    private static void writeFile(String encrytypedText, String s) {
    }

    private static String readFile(String file) {
        return "s";
    }

}
