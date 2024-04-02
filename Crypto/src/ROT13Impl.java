import static org.testng.internal.Utils.writeFile;
import static org.testng.reporters.Files.readFile;
import java.io.*;
import java.util.Scanner;

public class ROT13Impl extends ROT13 {
    ROT13Impl(Character cs, Character cf) {
        super(cs, cf);
    }

    ROT13Impl() {
    }

    public ROT13Impl(char start, char mid) {
        super(start, mid);
    }


    public static void main(String[] args) throws IOException {
        //Encrypt
        ROT13 rot13 = new ROT13('a', 'b');
        String result = null;
        //read the txt file
        File file = new File("/Users/abukar/Projects/SimpleCrypt/sonnet18.txt");
        Scanner sc = new Scanner(file);

        //encrypt the txt file
        StringBuilder text = new StringBuilder();
        while (sc.hasNextLine()) {
            text.append(rot13.crypt(sc.nextLine())).append("\n");
        }

        //push to new file
//        File starting = new File(System.getProperty("user.dir"));
        PrintWriter fileOut = new PrintWriter(new File("/Users/abukar/Projects/SimpleCrypt/sonnet18.enc"));
        fileOut.println(text);
        fileOut.close();



        // decrypte the encrpted txt

        //read the txt file
         file = new File("/Users/abukar/Projects/SimpleCrypt/sonnet18.enc");
         sc = new Scanner(file);

        //decrypt the txt file
        StringBuilder text1 = new StringBuilder();
        while (sc.hasNextLine()) {
            text1.append(rot13.decrypt(sc.nextLine())).append("\n");
        }


            //push that to new txt
            fileOut = new PrintWriter(new File("/Users/abukar/Projects/SimpleCrypt/Decrypted.dec"));
            fileOut.println(text1);
            fileOut.close();
            //read the encrypted file
            //read the decrpted txt

//        rot13.crypt(text);


        }
    }





